package org.Controller;

import org.Model.GameDifficulty;
import org.Model.Maze;
import org.Model.Monster;
import org.Model.Player;
import org.Model.Trap;
import org.View.GameView;

public class TwilightHeroesGame {
    private final GameView gameView;
    private final PlayerFacade playerFacade;
    private final MazeFacade mazeFacade;
    private final CombatSystem CombatSystem;
    private final TrapFacade trapFacade;

    public TwilightHeroesGame() {
        this.gameView = new GameView();
        this.playerFacade = new PlayerFacade();
        this.mazeFacade = new MazeFacade();
        this.CombatSystem = new CombatSystem();
        this.trapFacade = new TrapFacade();
    }

    public void initializeGame(){
        boolean running = true;

        while(running){
            this.gameView.showMainMenu();
            String choice = this.gameView.getUserInput();

            switch(choice){
                case "1": {
                    Player pg = playerFacade.playerCreation();
                    GameDifficulty difficulty = this.gameDifficulty();
                    Maze maze = mazeFacade.mazeCreation(difficulty.getMazeSize(), difficulty.getMaxShopItems(), pg);
                    this.game(pg, maze);
                    break;
                }
                case "2": {
                    this.gameView.loadGame();
                    break;
                }
                case "3": {
                    gameView.exitGame();
                    running = false;
                    break;
                }
                default: {
                    gameView.invalidOption();
                }
            }
        }
    }

    public GameDifficulty gameDifficulty(){
        boolean running = true;
        String choice = "";
        GameDifficulty difficulty = null;
        while(running){
            this.gameView.showDifficultyMenu();
            choice = this.gameView.getUserInput();
            difficulty = this.difficultyOption(choice);
            if(difficulty == null){
                this.gameView.invalidOption();
            }else{
                running = false;
            }
        }
        return difficulty;
    }

    private GameDifficulty difficultyOption(String choice){
        return switch (choice) {
            case "1" -> GameDifficulty.EASY;
            case "2" -> GameDifficulty.MEDIUM;
            case "3" -> GameDifficulty.HARD;
            default -> null;
        };
    }

    public void game(Player player, Maze maze){
        boolean game = true;
        while(game){
            this.mazeFacade.room(player.getPosition());
            if(player.getPosition().getMonster() != null ){
                Monster monster = player.getPosition().getMonster();
                CombatSystem.combat(player, monster);
            }
            else if(player.getPosition().getTrap() != null){
                Trap trap = player.getPosition().getTrap();
                trapFacade.triggerTrap(player, trap);
            }
            this.runPlayerAction(player, maze);
        }
    }

    public void movePlayer(Player player, Maze maze) {
        boolean running = true;
        while(running){
            boolean canMove = this.playerFacade.movePlayer(player, maze);
            if(canMove){
                running = false;
                this.mazeFacade.room(player.getPosition());
            }else{
                this.mazeFacade.wall();
            }
        }

    }

    public void runPlayerAction(Player player, Maze maze) {
        String action = this.playerFacade.playerAction();
        switch (action) {
            case "Move": {
                this.movePlayer(player, maze);
                break;
            }
            case "Examine": {
                this.mazeFacade.examineRoom(player);
                break;
            }
            case "Inventory": {
                this.playerFacade.getPlayerInventory(player);
                break;
            }
            case "Status": {
                this.playerFacade.getPlayerStatus(player);
                break;
            }
            case "Exit": {
                break;
            }
        }
    }
}
