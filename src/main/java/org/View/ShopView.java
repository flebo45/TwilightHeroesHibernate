package org.View;

import org.Model.Shop;

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

    public void enterShop(int money){
        System.out.println("Sei entrato nel negozio!");
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
        for(int i = 0; i< shop.getConsumableList().size(); i++){
            System.out.println((i+1) + shop.getConsumableList().get(i).toString());
        }
    }

        public void printArm(Shop shop){
        System.out.print("\nArmatura: ");
        for(int i = 0; i< shop.getArmorList().size(); i++){
            System.out.println((i+1) + shop.getArmorList().get(i).toString());
        }
    }

        public void printWeap(Shop shop){
        System.out.println("\nArma: ");
        for(int i = 0; i< shop.getWeaponList().size(); i++){
            System.out.println((i+1) + shop.getWeaponList().get(i).toString());
        }
    }

}
