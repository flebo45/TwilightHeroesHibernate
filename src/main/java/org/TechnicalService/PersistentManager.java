package org.TechnicalService;

import org.Model.*;

import java.util.List;

public class PersistentManager {
    private static PersistentManager instance;

    public static PersistentManager getInstance() {
        if (instance == null) {
            instance = new PersistentManager();
        }
        return instance;
    }

    public List<Trap> laodTraps() {
        return TrapDAO.findAllTraps();
    }

    public List<Monster> loadMonsters() {
        return PersonageDAO.findAllMonsters();
    }

    public List<Room> loadRooms(){
        return RoomDAO.findAllRooms();
    }

    public List<Armor> loadArmors(){
        return ItemDAO.findAllArmors();
    }

    public List<Weapon> loadWeapons(){
        return ItemDAO.findAllWeapons();
    }

    public List<Consumables> loadConsumables(){
        return ConsumableDAO.findAllConsumables();
    }
}
