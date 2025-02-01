package org.Controller;

import org.Model.Room;
import java.util.*;

public class PathGenerator {
    private MazeGenerator mazeGenerator;
    private Random random = new Random();

    public PathGenerator(MazeGenerator mazeGenerator) {
        this.mazeGenerator = mazeGenerator;
    }

    public void generatePaths() {
        int size = mazeGenerator.getSize();
        Room[][] maze = mazeGenerator.getMaze();
        boolean[][] visited = new boolean[size][size];
        Stack<int[]> stack = new Stack<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        stack.push(new int[]{1, 1});
        visited[1][1] = true;
        mazeGenerator.setRoom(1, 1, new Room("Sala Principale", "Una stanza centrale."));

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
                    mazeGenerator.setRoom(x + dx[dir], y + dy[dir], new Room("", ""));
                    mazeGenerator.setRoom(nx, ny, new Room("", ""));
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }

    private boolean isValid(int x, int y, boolean[][] visited) {
        int size = mazeGenerator.getSize();
        return x > 0 && x < size - 1 && y > 0 && y < size - 1 && !visited[x][y];
    }
}
