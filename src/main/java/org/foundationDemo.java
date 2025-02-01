package org;

import org.Model.*;
import org.TechnicalService.PersistentManager;

import java.util.List;

public class foundationDemo {
    public static void main(String[] args) {

        /**
        List<Trap> traps = PersistentManager.getInstance().laodTraps();
        for (Trap trap : traps) {
            System.out.println(trap);
        }
         */

        /**
        List<Monster> monsters = PersistentManager.getInstance().loadMonsters();
        for (Monster monster : monsters) {
            System.out.println(monster);
        }
         */

        /**
        List<Room> rooms = PersistentManager.getInstance().loadRooms();
        for (Room room : rooms) {
            System.out.println(room);
        }
         */

        /**
        List<Armor> armors = PersistentManager.getInstance().loadArmors();
        for (Armor armor : armors) {
            System.out.println(armor);
        }
         */

        /**
        List<Weapon> weapons = PersistentManager.getInstance().loadWeapons();
        for (Weapon weapon : weapons) {
            System.out.println(weapon);
        }
         */

        List<Consumables> consumables = PersistentManager.getInstance().loadConsumables();
        for(Consumables c : consumables){
            System.out.println(c);
        }
    }
}
