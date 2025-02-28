package org.View;

import java.util.Scanner;

import org.Model.Room;

public class MoveView {
    private static Scanner scanner = new Scanner(System.in);

        public static String PrintMove(){
            System.out.println("Usa W (su), A (sinistra), S (giù), D (destra) per muoverti.");
            String action = scanner.nextLine().toLowerCase();
        return action;
    }

    public static void ErrorMove(){System.out.println("Comando non valido. Usa W, A, S o D.");}

    public static void NewPosition(Room[][] maze, int newX, int newY){
        System.out.println("Ti sei spostato nella stanza: " + maze[newX][newY].getName());
        System.out.println(maze[newX][newY].getDescription());
    }

    public static void InvalidPosition(){System.out.println("Non puoi muoverti in quella direzione! Prova un'altra direzione.");}

    public static String NextMove(){

        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Muoviti");
        System.out.println("2. Esamina la stanza");
        System.out.println("3. Controlla l'inventario");
        System.out.println("4. Controlla lo status del personaggio");
        System.out.println("5. Esci dal gioco");
        String action = scanner.nextLine();
        return action;
    }
}
