package org.Model;

import org.TechnicalService.PersistentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoomService {

    public RoomService() {}

    public List<Room> getShuffledRooms(){
        List<Room> shuffledRooms = PersistentManager.getInstance().loadRooms();
        Collections.shuffle(shuffledRooms);
        return shuffledRooms;
    }
}
