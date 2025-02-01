package org.Controller;

import org.Model.Room;
import org.Model.Shop;

import java.util.Random;
import java.util.Stack;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MazeGenerator {
    private Room[][] maze;
    private int size;
    private Random random = new Random();

    public MazeGenerator() {
       
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public Room[][] getMaze(){
        return maze;
    }

    public Room getRoom(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            return null;
        }
        return maze[x][y];
    }

    public void setRoom(int x, int y, Room room) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            maze[x][y] = room;
        }
    }

    public void generateMaze() {
        this.maze = new Room[size][size];
        // Inizializza il labirinto con muri
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = null;// Muri inizializzati a `null` 
            }
        }
        // Genera il percorso principale
        createPath(1, 0);

        // Aggiungi entrata e uscita
        maze[1][0] = new Room("Ingresso", "L'ingresso del labirinto.");
        maze[1][0].setPositionX(1);
        maze[size - 2][size - 1] = new Room("Uscita", "L'uscita del labirinto.");
    }

    private void createPath(int startX, int startY) {
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[size][size];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        stack.push(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            List<Integer> directions = Arrays.asList(0, 1, 2, 3);
            Collections.shuffle(directions);

            for (int dir : directions) {
                int nx = x + dx[dir] * 2;
                int ny = y + dy[dir] * 2;

                if (isValid(nx, ny, visited)) {
                    maze[x + dx[dir]][y + dy[dir]] = new Room("", "");
                    maze[nx][ny] = new Room("", "");

                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }

    private boolean isValid(int x, int y, boolean[][] visited) {
        return x > 0 && x < size - 1 && y > 0 && y < size - 1 && !visited[x][y];
    }

    public void assignRooms(RoomLoader roomLoader) {
        Random random = new Random();

        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                Room room = getRoom(i, j);
                if (room != null && room.getName().isEmpty()) {
                    setRoom(i, j, roomLoader.getRandomRoom(random));
                    maze[i][j].setPositionX(i);
                    maze[i][j].setPositionY(j);
                }
            }
        }
    }
}