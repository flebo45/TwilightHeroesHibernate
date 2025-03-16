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
        //aggiungere modo per equippaggiare ed uare consumabili
    }
}
