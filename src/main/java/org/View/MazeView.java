package org.View;

import org.Model.Maze;
import org.Model.Player;
import org.Model.Shop;

public class MazeView {

    public MazeView(){

    }

    public void mazeAlert() {
        System.out.println("--------------------------------------------------------");
        System.out.println("I labirinto è stato generato! Buona Fortuna!");
        System.out.println("--------------------------------------------------------");
    }

    public void printMaze(Maze maze, Player player) {
        int playerX = player.getPosition().getPositionX();
        int playerY = player.getPosition().getPositionY();
        int mazeSize = maze.getSize();
        
        // Intervallo per stampare una mappa 5x5
        int startX = Math.max(0, playerX - 2); // 2 celle sopra il giocatore
        int startY = Math.max(0, playerY - 2); // 2 celle a sinistra del giocatore
        int endX = Math.min(mazeSize - 1, playerX + 2); // 2 celle sotto il giocatore
        int endY = Math.min(mazeSize - 1, playerY + 2); // 2 celle a destra del giocatore
    
        // Ciclo attraverso tutte le celle della mappa
        for (int i = 0; i < mazeSize; i++) {
            for (int j = 0; j < mazeSize; j++) {
                
                // Se la cella è all'interno della zona 5x5 attorno al giocatore, stampala normalmente
                if (i >= startX && i <= endX && j >= startY && j <= endY) {
                    
                    // Se la cella è quella del giocatore, stampa "P"
                    if (playerX == i && playerY == j) {
                        System.out.print("P");
                    }
                    // Se la cella è una stanza di tipo Shop, stampa "S"
                    else if (maze.getRoom(i, j) instanceof Shop) {
                        System.out.print("S");
                    }
                    // Se la cella è vuota (null), stampa un muro "█"
                    else if (maze.getRoom(i, j) == null) {
                        System.out.print("█");
                    }
                    // Se la cella ha un nome (è una stanza normale), stampa uno spazio vuoto
                    else if (maze.getRoom(i, j).getName() != null) {
                        System.out.print(" ");
                    }
                }
                // Se la cella non è visibile (fuori dal raggio del giocatore), stampa un carattere speciale
                else {
                    System.out.print("░"); // Cella non visibile
                }
            }
            System.out.println(); // Vai a capo alla fine della riga
        }
    }


    public void foundItem(String name, String a){
        if(a.equals("a")){System.out.println("Armatura:");}
        if(a.equals("w")){System.out.println("Arma: ");}
        if(a.equals("c")){System.out.println("Consumabile: ");}

        System.out.println("\n Hai trovato: " + name + "\n");
    }

    public void noItem(){
        System.out.println("Nessun oggetto è stato trovato...\n");
    }


    /**
     * public void print(Maze maze) {
     *         for (int i = 0; i < maze.getSize(); i++) {
     *             for (int j = 0; j < maze.getSize(); j++) {
     *                 if(maze.getRoom(i, j) == null) {
     *                     System.out.print("\nMuro");
     *                 }else {
     *                     System.out.print("\n");
     *                     System.out.print(maze.getRoom(i, j).getName());
     *                     System.out.print("; X:"  + maze.getRoom(i, j).getPositionX() + ", Y:" + maze.getRoom(i, j).getPositionY());
     *                 }
     *             }
     *             System.out.println();
     *         }
     *     }
     *
     */


    /**
     * public void printTest(Maze maze) {
     *         for (int i = 0; i < maze.getSize(); i++) {
     *             for (int j = 0; j < maze.getSize(); j++) {
     *                 if(maze.getRoom(i, j) == null) {
     *                     System.out.print("?");
     *                 }else {
     *                     System.out.print(" ");
     *                 }
     *             }
     *             System.out.println();
     *         }
     *     }
     *
     */

}

