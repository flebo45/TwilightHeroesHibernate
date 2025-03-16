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
        for (int i = 0; i < maze.getSize(); i++) {
            for (int j = 0; j < maze.getSize(); j++) {
                if(player.getPosition().getPositionX() == i && player.getPosition().getPositionY() == j) {
                    System.out.print("P");
                } else if (maze.getRoom(i, j) instanceof Shop) {
                    System.out.print("S");
                } else if (maze.getRoom(i, j) == null) {
                    System.out.print("█");
                } else if (maze.getRoom(i, j).getName() != null) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

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

