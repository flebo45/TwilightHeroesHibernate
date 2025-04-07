package org.View;

import java.util.Map;
import java.util.Map.Entry;

import org.Model.Armor;
import org.Model.Consumables;
import org.Model.Shop;
import org.Model.Weapon;

public class ShopView {

    public ShopView() {}

    public void showMoneyError() {
        System.out.println("Non hai abbastanza soldi per comprare questo oggetto.");
    }

    public void showSuccessTransaction() {
        System.out.println("Acquisto andato a buon fine. Troverai l'oggetto nel tuo inventario");
    }

    public void showItemError() {
        System.out.println("L'oggetto che hai selezionato non esiste o lo hai già acquistato.");
    }

    public void firstEnter(){
        System.out.println("Sei entrato nel negozio!");
    }

    public void enterShop(int money){
        System.out.println("Hai " + money + " monete d'oro. Cosa vuoi comprare?");
        System.out.println("Scegli una categoria di acquisto:");
        System.out.println("1. Armi");
        System.out.println("2. Armature");
        System.out.println("3. Consumabili");
        System.out.println("4. Esci");
    }

    public void printCons(Shop shop){
        System.out.println("Benvenuto nello shop, questi sono gli oggetti che puoi acquistare: ");
        System.out.println("Consumabili: ");
        int i = 1;
        for(Entry<Integer, Consumables> entry : shop.getConsumableList().entrySet()){
            Integer price  = entry.getKey();
            Consumables consumables = entry.getValue();
            System.out.println(i + ". Prezzo: " + price + " - Nome: " + consumables.getName());
            i++;
        }
    }

        public void printArm(Shop shop){
        System.out.print("\nArmature: ");
        int i = 1;
        for(Entry<Integer, Armor> entry : shop.getArmorList().entrySet()){
            Integer price  = entry.getKey();
            Armor armor = entry.getValue();
            System.out.println(i+". Prezzo: " + price + " - Nome: " + armor.getName());
            i++;
        }
    }

    public void printWeap(Shop shop){
    System.out.println("\nArmi: ");
    int i = 1;
    for(Entry<Integer, Weapon> entry : shop.getWeaponList().entrySet()){
        Integer price  = entry.getKey();
        Weapon weapon = entry.getValue();
        System.out.println(i+". Prezzo: " + price + " - Nome: " + weapon.getName());
        i++;
    }
    }
    

    public void printChoice(){
        System.out.println("Inserisci il numero dell'oggetto che vuoi comprare o inserisci '11' per tornare al menu principale!");
    }

}
