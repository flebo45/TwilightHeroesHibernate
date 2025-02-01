package org.Controller;

import org.Model.Player;
import org.Model.Room;
import org.Model.Shop;

public class MazePrinter {
    public static void printMaze(Room[][] maze, Player player){
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
}