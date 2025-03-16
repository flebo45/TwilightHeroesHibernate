package org.View;

import org.Model.Room;

public class RoomView {

    public RoomView() {

    }

    public void displayRoom(Room room) {
        System.out.println(room);  //violazione principi mvc, qua devo inserire la view a non nel to string
    }

    public void displayWall() {
        System.out.println("\nQui non puoi muoverti, c'è un muro.");
    }
}
