package org.Controller;

import org.Model.Player;
import org.Model.Room;

public class GameHandler {


    public void nuovaPartita(GameDifficulty difficolta, MazeGenerator mazeGenerator, Player player , PlayerController pgController) {

        // Definisci la dimensione del labirinto in base alla difficoltà
        int mazeSize = switch (difficolta) {
            case EASY -> 15;
            case NORMAL -> 20;
            case HARD -> 30;
        };
        mazeGenerator.setSize(mazeSize);
        // Genera il labirinto
        mazeGenerator.generateMaze();
        RoomLoader roomLoader = new RoomLoader();
        roomLoader.loadRoomDescriptions("src\\main\\java\\org\\room.txt");
        mazeGenerator.assignRooms(roomLoader);

        // Stampa il labirinto per verificare
        //mazeGenerator.printMaze();

        // Puoi aggiungere altre logiche di gioco qui
        System.out.println("Labirinto generato. Buona fortuna!");

        //Genera il giocatore
        System.out.println("con quale nome vuoi essere ricordato avventuriero?");
        pgController.pgGenerator(player);
    }

    public void caricaPartita() {
        System.out.println("\n=== Carica Partita ===");
        System.out.println("Funzionalità non ancora implementata. Ritorno al menu principale.\n");
    }
}
