package org.TechnicalService;

import org.Model.Room;

import java.util.List;

public class RoomDAO {

    public static List<Room> findAllRooms() {
        return EntityManager.getInstance().findAll(Room.class);
    }
}
