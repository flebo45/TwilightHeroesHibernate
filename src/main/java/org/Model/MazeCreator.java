package org.Model;

import java.util.*;

public class MazeCreator {
    private final RoomService roomService;
    private Maze maze;
    private final Random random = new Random();


    public MazeCreator(int size) {
        this.roomService = new RoomService();
        this.maze = new Maze(size);
        initializeMazeWithWalls();
    }


    private void initializeMazeWithWalls() {
        for (int x = 0; x < maze.getSize(); x++) {
            for (int y = 0; y < maze.getSize(); y++) {
                if (x % 2 == 1 && y % 2 == 1) { // Only odd indices get rooms
                    maze.setRoom(x, y, new Room(x, y));
                } else {
                    maze.setRoom(x, y, null); // Wall
                }
            }
        }
    }

    public Maze generateMaze() {
        Room startRoom = maze.getRoom(1, 1);  // Start at first valid room
        Room endRoom = maze.getRoom(maze.getSize() - 2, maze.getSize() - 2); // Ensure valid end

        if (startRoom == null || endRoom == null) {
            throw new IllegalStateException("Start or end room is not valid.");
        }

        generatePath(startRoom); // Create a random path

        // Ensure connectivity to end room
        if (!endRoom.isVisited()) {
            forcePathToEnd(startRoom, endRoom);
        }
        this.populateRooms();

        return maze;
    }

    private void generatePath(Room startRoom) {
        Stack<Room> stack = new Stack<>();
        stack.push(startRoom);
        startRoom.setVisited(true);

        while (!stack.isEmpty()) {
            Room current = stack.peek();
            List<Direction> unvisitedNeighbors = getUnvisitedNeighbors(current);

            if (!unvisitedNeighbors.isEmpty()) {
                Direction chosenDir = unvisitedNeighbors.get(random.nextInt(unvisitedNeighbors.size()));
                Room nextRoom = getRoomInDirection(current, chosenDir);

                if (nextRoom != null) {
                    // Remove wall between current and next room
                    int wallX = (current.getPositionX() + nextRoom.getPositionX()) / 2;
                    int wallY = (current.getPositionY() + nextRoom.getPositionY()) / 2;
                    maze.setRoom(wallX, wallY, new Room(wallX, wallY)); // Convert wall to a passage

                    nextRoom.setVisited(true);
                    stack.push(nextRoom);
                }
            } else {
                stack.pop(); // Backtrack
            }
        }
    }

    private List<Direction> getUnvisitedNeighbors(Room room) {
        List<Direction> directions = new ArrayList<>();
        for (Direction dir : Direction.values()) {
            Room neighbor = getRoomInDirection(room, dir);
            if (neighbor != null && !neighbor.isVisited()) {
                directions.add(dir);
            }
        }
        return directions;
    }

    private Room getRoomInDirection(Room room, Direction direction) {
        int newX = room.getPositionX() + direction.getDx() * 2; // Step over walls
        int newY = room.getPositionY() + direction.getDy() * 2;
        return maze.getRoom(newX, newY);
    }

    private void forcePathToEnd(Room start, Room end) {
        Room current = start;
        while (current != end) {
            List<Direction> possibleDirections = getUnvisitedNeighbors(current);
            if (possibleDirections.isEmpty()) break; // Stop if no possible ways
            Direction chosenDir = possibleDirections.get(0);
            Room nextRoom = getRoomInDirection(current, chosenDir);

            int wallX = (current.getPositionX() + nextRoom.getPositionX()) / 2;
            int wallY = (current.getPositionY() + nextRoom.getPositionY()) / 2;
            maze.setRoom(wallX, wallY, new Room(wallX, wallY)); // Remove wall

            nextRoom.setVisited(true);
            current = nextRoom;
        }
    }

    private void populateRooms() {
        List<Room> shuffledRooms = this.roomService.getShuffledRooms();
        for(int i = 0; i < this.maze.getSize(); i++) {
            for(int j = 0; j < this.maze.getSize(); j++) {
                if(i == 1 && j == 1){
                    this.maze.getRoom(i, j).setName("Ingresso del labirinto");
                    this.maze.getRoom(i, j).setDescription("Qui comincia la tua avventura!");
                }else if(i == this.maze.getSize() - 2 && j == this.maze.getSize() - 2){
                    this.maze.getRoom(i, j).setName("Uscita del labirinto");
                    this.maze.getRoom(i, j).setDescription("Finalmente vedi uno spiraglio di luce");
                }
                else if(this.maze.getRoom(i, j) != null) {
                    this.maze.getRoom(i, j).setName(shuffledRooms.get(i + j).getName());
                    this.maze.getRoom(i, j).setDescription(shuffledRooms.get(i + j).getDescription());
                }
            }
        }
    }


}
