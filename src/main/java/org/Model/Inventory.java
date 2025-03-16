package org.Model;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> inventoryItem = new ArrayList<>();
    ArrayList<Consumables> inventoryConsumables= new ArrayList<>();

    public Inventory() {}
   

    public ArrayList<Item> getItemList() {
        return this.inventoryItem;
    }

    public ArrayList<Consumables> getConsumables() {
        return this.inventoryConsumables;
    }

    public void addConsumables(Consumables consumables) {
        this.inventoryConsumables.add(consumables);
    }
    public void addItem(Item item) {
        this.inventoryItem.add(item);
    }
    public void removeConsumable(Consumables item) {
        this.inventoryConsumables.remove(item);
    }
    public void removeItem(Item item) {
        this.inventoryItem.remove(item);
    }

}
