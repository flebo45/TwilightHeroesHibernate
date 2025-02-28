package org.Controller;

import org.Model.*;
import org.TechnicalService.PersistentManager;
import org.View.CombactVIew;
import org.View.CombactView;
import org.View.InventoryView;
import org.View.Menu;
import org.View.MoveView;
import org.View.PlayerView;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Master {
        private final Menu menu;
        private final GameHandler gameHandler;
        private boolean giocoAttivo;
        private final Player player;
        private final MazeGenerator mazeGen;
        private Room[][] maze;
        private PlayerController pgController;
        
        public Master() {
            this.menu = new Menu();
            this.gameHandler = new GameHandler();
            this.giocoAttivo = true;
            this.player = new Player();
            this.mazeGen = new MazeGenerator();
            this.pgController = new PlayerController();
        }
    
        public void avvia() {
            while (giocoAttivo) {
                int scelta = menu.mostraMenuPrincipale();
    
                switch (scelta) {
                    case 1 -> {
                        GameDifficulty difficolta = menu.scegliDifficolta();
                        giocoAttivo = false;
                        gameHandler.nuovaPartita(difficolta , mazeGen , player, pgController);
                       
                    }
                    case 2 -> gameHandler.caricaPartita();
                    case 3 -> {
                        giocoAttivo = false;
                        menu.mostraMessaggio("Grazie per aver giocato a Twilight Heroes! Alla prossima!");
                        giocoAttivo = false;
                    }
                    default -> menu.mostraMessaggio("Opzione non valida. Riprova.");
                }
            }
        }
         

        public void displayCurrentRoom() {
            System.out.println(player.getPosition().getName());
            System.out.println(player.getPosition().getDescription());
        }

 
        public void Game(Master master) throws IOException {
            maze = mazeGen.getMaze();
            List<Consumables> consumables = PersistentManager.getInstance().loadConsumables();
            List<Weapon> weapons = PersistentManager.getInstance().loadWeapons();
            List<Armor> armors = PersistentManager.getInstance().loadArmors();
            List<Monster> monsters = PersistentManager.getInstance().loadMonsters();
            List<Trap> traps = PersistentManager.getInstance().laodTraps();
            ShopPlacer shopPlacer = new ShopPlacer(consumables, armors, weapons);
            System.out.print(maze[1][0].getName());
            MapPopulator.populateMapWithMOnster(maze, monsters);
            MapPopulator.populateMapWithTrap(maze, traps);
            MapPopulator.populateMap(maze, consumables);
            MapPopulator.populateMapWithArmor(maze, armors);
            MapPopulator.populateMapWithWeapons(maze, weapons);
            shopPlacer.placeShop(maze);
            player.setPosition(maze[1][0]);
            MazePrinter.printMaze(maze, player);
            System.out.println(player.getPosition().getName());
            System.out.println(player.getPosition().getPositionX());
            System.out.println(player.getPosition().getPositionY());
            System.out.println("\nBenvenuto, " + player.getName());
                boolean gameRunning = true;
                displayCurrentRoom();
                while (gameRunning) {
                    if (player.getPosition().getMonster() != null) {
                        Monster monster = player.getPosition().getMonster();
                        CombactView.MonsterEnc(monster);
                        CombatSystem.startCombat(player, monster);
                        player.getPosition().setMonster(null); // Rimuovi il mostro sconfitto
                    }
                    if (player.getPosition().getTrap() != null){
                        Trap trap = player.getPosition().getTrap();
                        boolean result =trap.resolveTrap(player);
                        if(result == true){player.getPosition().setTrap(null);}
                        else{
                            if(player.getCurrentHP()<= 0){gameOver();}
                            CombactView.TrapEnc();
                        }
                        
                    }
                    if (player.getPosition() instanceof Shop){
                        int playerX = player.getPosition().getPositionX();
                        int playerY = player.getPosition().getPositionY();
                        ((Shop) maze[playerX][playerY]).enterShop(player, scanner, master);
                    } 
                    

                  
                    String action = MoveView.NextMove();
                    
                    switch (action) {
                        case "1" -> // Movimento
                            movePlayer();
                        case "2" -> // Esamina la stanza
                            examineRoom(player.getPosition());
                        case "3" -> // Controlla inventario
                            checkInventory();
                        case "4" -> 
                            checkStatusPg();
                        case "5" -> {
                            // Esci
                            System.out.println("Hai lasciato il gioco.");
                            gameRunning = false;
                        }
                        default -> System.out.println("Azione non valida. Riprova.");
                    }
                    
                    //if (isVictory()) {
                        //System.out.println("Congratulazioni! Hai raggiunto l'uscita e vinto il gioco!");
                        //gameRunning = false;
                    //}
                } 
            }
    

    public void movePlayer() {
       
        String action = MoveView.PrintMove();
        
         // Legge il comando dell'utente
        int currentX = player.getPosition().getPositionX();
        int currentY = player.getPosition().getPositionY();
    
        int newX = currentX, newY = currentY; // Nuove coordinate
    
        switch (action) {
            case "w" -> newX = currentX - 1; // Su
            case "a" -> newY = currentY - 1; // Sinistra
            case "s" -> newX = currentX + 1; // Giù
            case "d" -> newY = currentY + 1; // Destra
            default -> {
               MoveView.ErrorMove();
                return;
            }
        }
    
        // Controlla se la nuova posizione è valida
        if (newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[0].length && maze[newX][newY] != null) {
            player.setPosition(maze[newX][newY]);
            MoveView.NewPosition(maze, newX, newY);
        } else {
            MoveView.InvalidPosition();
        }
        MazePrinter.printMaze(maze, player);
    }

    private void examineRoom(Room currentRoom) {

        PlayerView.examineRoom();
       
        boolean foundSomething = false;
    
        // Se ci sono consumabili, raccoglili
        if (currentRoom.getConsumables() != null) {
            int a = 1;
            PlayerView.ExamineReuslt(a, currentRoom);
            player.getInventory().addConsumables(currentRoom.getConsumables());
            currentRoom.setConsumables(null); // Rimuovi il consumabile dalla stanza
            foundSomething = true;
        }
    
        // Se c'è un'arma, raccoglila
        if (currentRoom.getWeapon() != null) {
            int b = 2;
            PlayerView.ExamineReuslt(b, currentRoom);
            player.getInventory().addWeapon(currentRoom.getWeapon());
            currentRoom.setWeapon(null); // Rimuovi l'arma dalla stanza
            foundSomething = true;
        }
    
        // Se c'è un'armatura, raccoglila
        if (currentRoom.getArmor() != null) {
            int c = 3;
            PlayerView.ExamineReuslt(c, currentRoom);
            player.getInventory().addArmor(currentRoom.getArmor());
            currentRoom.setArmor(null); // Rimuovi l'armatura dalla stanza
            foundSomething = true;
        }
    
        // Se la stanza era vuota
        if (!foundSomething) {
            PlayerView.ExamineReuslt(0, currentRoom);
        }
    }
    

        private void checkInventory() {
            // Ottieni l'inventario del giocatore
            List<Consumables> inventoryCons = player.getInventory().getConsumables();
            List<Item> inventoryItem = player.getInventory().getItemList();
            String action;
            if (inventoryCons.isEmpty() && inventoryItem.isEmpty()) {

                InventoryView.InvView(inventoryCons, inventoryItem);

            } else if (inventoryItem.isEmpty()) {
            
                action = InventoryView.InvView(inventoryCons, inventoryItem);

                if ("1".equals(action)) {

                useConsumable(inventoryCons);
                }
            }
            else if(inventoryCons.isEmpty()){
                action = InventoryView.InvView(inventoryCons, inventoryItem);
                if ("1".equals(action)) {
                    equipeItem(inventoryItem);
                }
            }
            else{
                action = InventoryView.InvView(inventoryCons, inventoryItem);
                if ("1".equals(action)) {
                    useConsumable(inventoryCons);
                    
                }
                
                else{
                    equipeItem(inventoryItem);
                }
            }
        }

    private void checkStatusPg() {
       pgController.getStatus(player);
    }

    private void useConsumable(List<Consumables> inventoryCons){

        Consumables selectedConsumable =InventoryView.UseConsumable(inventoryCons);
        selectedConsumable.consume(player , pgController);
        // Rimuovi l'oggetto dall'inventario dopo l'uso
        player.getInventory().removeConsumable(selectedConsumable);
    }

    private void equipeItem(List<Item> inventoryItem){

           
       }

    public static void gameOver(){
        System.out.println("Sei stato sconfitto!!");
    }   
    

}
/* 
    private boolean isVictory() {
        Model.Room exitRoom = maze.getSize()- 2 + "," + (mazeGenerator.getSize() - 1));
        return player.getX() == exitRoom.getX() && player.getY() == exitRoom.getY();
    }*/


