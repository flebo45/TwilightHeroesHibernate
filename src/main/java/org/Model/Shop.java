package org.Model;


import java.util.*;

public class Shop extends Room {
    //Integer is the price of the item
    private Map<Integer, Armor> armorList;
    private Map<Integer, Weapon> weaponList;
    private Map<Integer, Consumables> consumablesList;


    public Shop(List<Consumables> consumables, List<Armor> armors, List<Weapon> weapons, int maxItem) {
        this.armorList = new HashMap<>();
        this.weaponList = new HashMap<>();
        this.consumablesList = new HashMap<>();
        for(int i = 0; i < maxItem; i++) {
            this.armorList.put((i+1) * 5, armors.get(i));
            this.weaponList.put((i+1) * 5, weapons.get(i));
            this.consumablesList.put((i+1) * 5, consumables.get(i));
        }

    }

    public Map<Integer, Armor> getArmorList() {
        return this.armorList;
    }

    public Map<Integer, Weapon> getWeaponList() {
        return this.weaponList;
    }

    public Map<Integer, Consumables> getConsumableList() {
        return this.consumablesList;
    }

    public void removeArmor(int price) {
        this.armorList.remove(price);
    }

    public void removeConsumable(int price) {
        this.consumablesList.remove(price);
    }

    public void removeWeapon(int price) {
        this.weaponList.remove(price);
    }
}
    
