package org.TechnicalService;

import org.Model.*;
import org.Model.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<List<?>> loadShopItems(int maxItems) {
        return List.of(ConsumableDAO.findShopConsumables(maxItems), ItemDAO.findShopArmor(maxItems), ItemDAO.findShopWeapon(maxItems));
    }

    public Character loadCharacter(String name) {
        return PersonageDAO.findCharacterByName(name);
    }
}
