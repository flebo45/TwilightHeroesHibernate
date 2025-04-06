package org.Controller;

import org.Model.Character;
import org.Model.Direction;
import org.Model.Maze;
import org.Model.Player;
import org.TechnicalService.PersistentManager;
import org.View.GameView;
import org.View.PlayerView;

public class PlayerFacade {
    private final PlayerView playerView;
    private final GameView gameView;

    public PlayerFacade() {
        this.playerView = new PlayerView();
        this.gameView = new GameView();
    }

    public Player playerCreation(){
        playerView.playerName();
        String pgName = gameView.getUserInput();
        String characterName = "";
        String characterChoice = "";


        while(true) {
            playerView.showCharactersMenu();
            String choice = gameView.getUserInput();
            characterChoice = this.characterOption(choice);
            if (!characterChoice.equals("Error")) {
                characterName = characterChoice;
                break;
            } else {
                gameView.invalidOption();
            }
        }
        Character character = PersistentManager.getInstance().loadCharacter(characterName);
        return new Player(pgName, character);
    }

    private String characterOption(String choice) {
        return switch (choice) {
            case "1" -> "Guerriero";
            case "2" -> "Ladro";
            case "3" -> "Mago";
            case "4" -> "Paladino";
            case "5" -> "Ranger";
            case "6" -> "Berserker";
            case "7" -> "Monaco";
            default -> "Error";
        };

    }

    public String playerAction() {
        boolean running = true;
        String choice = "";
        String action = "";

        while (running) {
            this.playerView.showPlayerActions();
            choice = gameView.getUserInput();
            action = this.actionOption(choice);
            if(action.equals("Error")) {
                gameView.invalidOption();
            }else{
                running = false;
            }
        }
        return action;
    }

    private String actionOption(String choice) {
        return switch (choice){
            case "1" -> "Move";
            case "2" -> "Examine";
            case "3" -> "Inventory";
            case "4" -> "Status";
            case "5" -> "Exit";
            default -> "Error";
        };
    }



    public boolean movePlayer(Player player, Maze maze) {
        boolean running = true;
        String directionInput = "";
        Direction direction = null;
        while(running){
            this.playerView.showDirections();
            directionInput = gameView.getUserInput();
            direction = Direction.fromInput(directionInput);
            if(direction == null){
                this.gameView.invalidOption();
            }else{
                running = false;
            }
        }
        return player.move(direction, maze);

    }

    public void getPlayerStatus(Player player) {
        this.playerView.showPlayerStatus(player);
    }

  
    public void getPlayerInventory(Player player) {
        this.playerView.showPlayerInventory(player);
        this.playerView.askForaction();
        
        String input;
        do {
            input = this.gameView.getUserInput().trim();
        } while (!isValidInput(input));
    
        if ("1".equals(input)) {
            showAndEquipItem(player);
        } else if ("2".equals(input)) {
            showAndUseConsumable(player);
        }
        else if( "3".equals(input)){}
    }

    private boolean isValidInput(String input) {
        return "1".equals(input) || "2".equals(input) || "3".equals(input);
    }
    
    private void showAndEquipItem(Player player) {
        if (player.getInventory().getItemList().isEmpty()) {
            this.playerView.noItem();
            return;
        }
        this.playerView.showItemList(player);

        int choice = getValidChoice(player.getInventory().getItemList().size());
        player.equipItem(player.getInventory().getItemList().get(choice - 1));
        this.playerView.newEquipped(player.getInventory().getItemList().get(choice - 1).getName());
    }
    
    private void showAndUseConsumable(Player player) {
        if (player.getInventory().getConsumables().isEmpty()) {
            this.playerView.noConsumables();
            return;
        }
        this.playerView.showConsumableList(player);
        int choice = getValidChoice(player.getInventory().getConsumables().size());
        player.getInventory().getConsumables().get(choice - 1).useConsumable(player);
       this.playerView.useConsumable(player.getInventory().getConsumables().get(choice-1));
       player.getInventory().getConsumables().remove(choice -1);
    }
    
    private int getValidChoice(int maxOption) {
        int choice;
        do {
            try {
                choice = Integer.parseInt(this.gameView.getUserInput().trim());
            } catch (NumberFormatException e) {
                choice = -1;
            }
        } while (choice < 1 || choice > maxOption);
        
        return choice;
    }
    

}
