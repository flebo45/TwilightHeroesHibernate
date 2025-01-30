package org.Controller;

import org.Model.*;
import org.View.Menu;

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
        private Shop shop;
    
        public Master() {
            this.menu = new Menu();
            this.gameHandler = new GameHandler();
            this.giocoAttivo = true;
            this.player = new Player();
            this.mazeGen = new MazeGenerator();
        }
    
        public void avvia() {
            while (giocoAttivo) {
                int scelta = menu.mostraMenuPrincipale();
    
                switch (scelta) {
                    case 1 -> {
                        GameDifficulty difficolta = menu.scegliDifficolta();
                        giocoAttivo = false;
                        gameHandler.nuovaPartita(difficolta , mazeGen , player);
                       
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

 
        public void Game() throws IOException {
            maze = mazeGen.getMaze();
            List<Consumables> consumables = ConsumableFactory.loadConsumables("src/main/java/org/consumable.txt");
            List<Weapon> weapons = ItemFactory.loadWeapons("src/main/java/org/weapon.txt");
            List<Armor> armors = ItemFactory.loadArmor("src/main/java/org/armor.txt");
            List<Monster> monsters = MonsterFactory.loadMonster("src/main/java/org/monster.txt");
            List<Trap> traps = TrapFactory.loadTraps("src/main/java/org/trap.txt");
            System.out.print(maze[1][0].getName());
            MapPopulator.populateMapWithMOnster(maze, monsters);
            MapPopulator.populateMapWithTrap(maze, traps);
            MapPopulator.populateMap(maze, consumables);
            MapPopulator.populateMapWithArmor(maze, armors);
            MapPopulator.populateMapWithWeapons(maze, weapons);
            mazeGen.placeShop(consumables, armors, weapons);
            player.setPosition(maze[1][0]);
            printMaze();
            System.out.println(player.getPosition().getName());
            System.out.println(player.getPosition().getPositionX());
            System.out.println(player.getPosition().getPositionY());
            System.out.println("\nBenvenuto, " + player.getName());
            Scanner scanner = new Scanner(System.in);
                boolean gameRunning = true;
                displayCurrentRoom();
                while (gameRunning) {
                    if (player.getPosition().getMonster() != null) {
                        Monster monster = player.getPosition().getMonster();
                        System.out.println("C'è un mostro qui: " + monster.getName() + "!");
                        CombatSystem.startCombat(player, monster);
                        player.getPosition().setMonster(null); // Rimuovi il mostro sconfitto
                    }
                    if (player.getPosition().getTrap() != null){
                        Trap trap = player.getPosition().getTrap();
                        boolean result =trap.resolveTrap(player);
                        if(result == true){player.getPosition().setTrap(null);}
                        else{
                            if(player.getCurrentHP()<= 0){gameOver();}
                            System.out.println("La trappola è rimasta attiva, \nper esaminare la stanza devi prima superare la prova, altrimenti si riattiverà");
                        }
                        
                    }
                    if (player.getPosition() instanceof Shop){
                        int playerX = player.getPosition().getPositionX();
                        int playerY = player.getPosition().getPositionY();
                        ((Shop) maze[playerX][playerY]).enterShop(player, scanner);
                    } 
                    
                    System.out.println("\nCosa vuoi fare?");
                    System.out.println("1. Muoviti");
                    System.out.println("2. Esamina la stanza");
                    System.out.println("3. Controlla l'inventario");
                    System.out.println("4. Controlla lo status del personaggio");
                    System.out.println("5. Esci dal gioco");
                    
                    String action = scanner.nextLine();
                    
                    switch (action) {
                        case "1" -> // Movimento
                            movePlayer(scanner);
                        case "2" -> // Esamina la stanza
                            examineRoom(player.getPosition());
                        case "3" -> // Controlla inventario
                            checkInventory(scanner);
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
    

   
    private void movePlayer(Scanner scanner) {
        System.out.println("Usa W (su), A (sinistra), S (giù), D (destra) per muoverti.");
      
    
        String action = scanner.nextLine().toLowerCase(); // Legge il comando dell'utente
        int currentX = player.getPosition().getPositionX();
        int currentY = player.getPosition().getPositionY();
    
        int newX = currentX, newY = currentY; // Nuove coordinate
    
        switch (action) {
            case "w" -> newX = currentX - 1; // Su
            case "a" -> newY = currentY - 1; // Sinistra
            case "s" -> newX = currentX + 1; // Giù
            case "d" -> newY = currentY + 1; // Destra
            default -> {
                System.out.println("Comando non valido. Usa W, A, S o D.");
                return;
            }
        }
    
        // Controlla se la nuova posizione è valida
        if (newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[0].length && maze[newX][newY] != null) {
            player.setPosition(maze[newX][newY]);
            System.out.println("Ti sei spostato nella stanza: " + maze[newX][newY].getName());
            System.out.println(maze[newX][newY].getDescription());
        } else {
            System.out.println("Non puoi muoverti in quella direzione! Prova un'altra direzione.");
        }
        printMaze();
    }

    private void examineRoom(Room currentRoom) {
        System.out.println("Esamini la stanza...");
    
        boolean foundSomething = false;
    
        // Se ci sono consumabili, raccoglili
        if (currentRoom.getConsumables() != null) {
            System.out.println(" Hai trovato un consumabile: " + currentRoom.getConsumables().toString());
            player.getInventory().addConsumables(currentRoom.getConsumables());
            currentRoom.setConsumables(null); // Rimuovi il consumabile dalla stanza
            foundSomething = true;
        }
    
        // Se c'è un'arma, raccoglila
        if (currentRoom.getWeapon() != null) {
            System.out.println("Hai trovato un'arma: " + currentRoom.getWeapon().toString());
            player.getInventory().addWeapon(currentRoom.getWeapon());
            currentRoom.setWeapon(null); // Rimuovi l'arma dalla stanza
            foundSomething = true;
        }
    
        // Se c'è un'armatura, raccoglila
        if (currentRoom.getArmor() != null) {
            System.out.println("Hai trovato un'armatura: " + currentRoom.getArmor().toString());
            player.getInventory().addArmor(currentRoom.getArmor());
            currentRoom.setArmor(null); // Rimuovi l'armatura dalla stanza
            foundSomething = true;
        }
    
        // Se la stanza era vuota
        if (!foundSomething) {
            System.out.println("Non c'è niente nella stanza.");
        }
    }
    

        private void checkInventory(Scanner scanner) {
            System.out.println("Inventario:");
        
            // Ottieni l'inventario del giocatore
            List<Consumables> inventoryCons = player.getInventory().getConsumables();
            List<Item> inventoryItem = player.getInventory().getItemList();
            if (inventoryCons.isEmpty() && inventoryItem.isEmpty()) {
                System.out.println("Il tuo inventario è vuoto.");
            } else if (inventoryItem.isEmpty()) {
                // Itera sull'inventario
                System.out.println("-Consuambili:");
                for (int i = 0; i < inventoryCons.size(); i++) {
                    System.out.println((i + 1) + ". " + inventoryCons.get(i).toString());
                }
                System.out.println("Vuoi utilizzare un consumabile?");
                System.out.println("1. Si");
                System.out.println("2. No");
                String action = scanner.nextLine();
                if ("1".equals(action)) {
                useConsumable(inventoryCons,scanner);
                }
            }
            else if(inventoryCons.isEmpty()){
                System.out.println("-Oggetti:");
                for (int i= 0; i< inventoryItem.size(); i++) {
                    System.out.println((i+1) + ". " + inventoryItem.get(i).toString());
                }
                System.out.println("Vuoi equiapggiare una nuova armatura o arma?");
                System.out.println("1. Si");
                System.out.println("2. No");
                String action = scanner.nextLine();
                    
                if ("1".equals(action)) {
                    equipeItem(scanner,inventoryItem);
                }
            }
            else{
                System.out.println("-Consuambili");
                for (int i = 0; i < inventoryCons.size(); i++) {
                    System.out.println((i + 1) + ". " + inventoryCons.get(i).toString());
                }
                System.out.println("\n");
                System.out.println("-Oggetti:");
                for (int i= 0; i< inventoryItem.size(); i++) {
                    System.out.println((i+1) + ". " + inventoryItem.get(i).toString());
                }
                System.out.println("\n");
                System.out.println("Vuoi utilizzare un consumabile o equipaggiare un oggetto?");
                System.out.println("1. consumabile");
                System.out.println("2. equipaggiamento");
                String action = scanner.nextLine();
                if ("1".equals(action)) {
                    useConsumable(inventoryCons,scanner);
                    
                }
                
                else{
                    equipeItem(scanner,inventoryItem);
                }
            }
        }

    private void checkStatusPg() {
       player.getStatus(player);
    }
        private void printMaze(){
            for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (player.getPosition().getPositionX() == i && player.getPosition().getPositionY() == j) {
                    System.out.print("P"); // Indica la posizione del giocatore
                }
                else if(maze[i][j] instanceof Shop){
                    System.out.print("@");
                }
                 else if (maze[i][j] == null) {
                    System.out.print("#"); // Muro
                } else {
                    System.out.print(" "); // Spazio percorribile
                }
            }
            System.out.println(); // A capo alla fine di ogni riga
        }
    }


    private void useConsumable(List<Consumables> inventoryCons, Scanner scanner){

    
        System.out.println("Seleziona il numero del consumabile da utilizzare:");
        int selectedIndex;
        
        try {
            selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;

            if (selectedIndex >= 0 && selectedIndex < inventoryCons.size()) {
                // Recupera l'oggetto selezionato
                Consumables selectedConsumable = inventoryCons.get(selectedIndex);
                System.out.println("Hai scelto: " + selectedConsumable.toString());
                selectedConsumable.consume(player);
                // Rimuovi l'oggetto dall'inventario dopo l'uso
                player.getInventory().removeConsumable(selectedConsumable);
            } else {
                System.out.println("Scelta non valida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Inserisci un numero valido.");
        }
    }

    private void equipeItem(Scanner scanner, List<Item> inventoryItem){

            System.out.println("Seleziona il numero dell'equipaggiamento che vuoi utilizzare");

            int selectedIndex;
            try {
                selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;
    
                if (selectedIndex >= 0 && selectedIndex < inventoryItem.size()) {
                    // Recupera l'oggetto selezionato
                    Item selectedItem = inventoryItem.get(selectedIndex);
                    System.out.println("Hai scelto: " + selectedItem.toString());
                    if (selectedItem instanceof Armor){
                        Armor selectedArmor = (Armor) selectedItem;
                        player.equipArmorPiece(selectedArmor, player);
                    }
                    else if (selectedItem instanceof Weapon){
                        Weapon selectedWeapon = (Weapon) selectedItem;
                        player.setWeapon(selectedWeapon);;
                    }
                    
                } else {
                    System.out.println("Scelta non valida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
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


