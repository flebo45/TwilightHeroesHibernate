package org.Model;

public class Maze {
    private Room[][] rooms;
    private final int size;

    public Maze(int size) {
        this.size = size;
        this.rooms = new Room[size][size];
    }

    public int getSize() {
        return this.size;
    }

    public Room[][] getRooms() {
        return this.rooms;
    }

    public void setRoom(int row, int column, Room room) {
        if (row >= 0 && row < this.size && column >= 0 && column < this.size) {
            this.rooms[row][column] = room;
        }
    }

    public Room getRoom(int x, int y) {
        if (x >= 0 && x < this.size && y >= 0 && y < this.size) {
            return this.rooms[x][y];
        }else{
            return null;
        }
    }

    public Room getAdjacentRoom(Room currentRoom, Direction direction) {
        System.out.println(direction.getDx() + " " + direction.getDy());
        //System.out.println(this.getRooms()[currentRoom.getPositionX() + direction.getDx()] [currentRoom.getPositionY() + direction.getDy()]);
        return this.getRoom(currentRoom.getPositionX() + direction.getDx(), currentRoom.getPositionY() + direction.getDy() );
    }
}
