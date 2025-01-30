package Model;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Shop extends Room {
    private List<Armor> shopArmor;
    private List<Weapon> shopWeapon;
    private List<Consumables> shopConsumable;
    private int goldRequired; // Per definire prezzi generici
    private static final int MAX_ITEMS_PER_TYPE = 5;

    public Shop(List<Consumables> consumables, List<Armor> armors, List<Weapon> weapons) {
        super("Negozio",""); // Inizializza come una stanza normale
        this.shopWeapon = generateRandomItems(weapons);
        this.shopArmor = generateRandomItems(armors);
        this.shopConsumable = generateRandomItems(consumables);
    }


    public void enterShop(Player player, Scanner scanner) {
        System.out.println("Sei entrato nel negozio! Ecco cosa puoi acquistare:");
        int index = 1;
        System.out.println("Armi:");
        for (Item item : shopWeapon) {
            System.out.println(index + ". " + item.getName() + " - Prezzo: " + getItemPrice(item) + " monete d'oro");
            index++;
        }

        System.out.println("Armature:");
        for (Item item : shopArmor) {
            System.out.println(index + ". " + item.getName() + " - Prezzo: " + getItemPrice(item) + " monete d'oro");
            index++;
        }
        
        System.out.println("Consuambili:");
        for (Consumables consumable: shopConsumable) {
            System.out.println(index + ". " + consumable.getName() + " - Prezzo: " + getConsumablePrice(consumable) + " monete d'oro");
            index++;
        }
        int money = player.getMoney();
        System.out.println("Hai " + money + " monete d'oro. Cosa vuoi comprare?");
        System.out.println("1. Armi");
        System.out.println("2. Armature");
        System.out.println("3. Consumabili");
        int choice = Integer.parseInt(scanner.nextLine()); // Metodo per leggere l'input del giocatore

        if (choice == 1 ){
                System.out.println("Inserisci il numero dell'oggetto che vuoi comprare!");
                int itembuy = Integer.parseInt(scanner.nextLine());
                if (itembuy <= shopWeapon.size()) {
                    Item selectedItem = shopWeapon.get(choice - 1);
                    int price = getItemPrice(selectedItem);
                    if (money >= price) {
                        money -= price;
                        player.setMoney(money);
                        Weapon selectedWeapon = (Weapon) selectedItem;
                         player.getInventory().addWeapon(selectedWeapon);
                         shopWeapon.remove(selectedItem);
                         System.out.println("Hai acquistato: " + selectedItem.getName());
                    }
                    else {
                        System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");
                } 
            }
        }
        else if (choice == 2) {
            System.out.println("Inserisci il numero dell'oggetto che vuoi comprare!");
            int itembuy = Integer.parseInt(scanner.nextLine());
            if (itembuy <= shopArmor.size()) {
                Item selectedItem = shopArmor.get(choice - 1);
                int price = getItemPrice(selectedItem);
                if (money >= price) {
                    money -= price;
                    player.setMoney(money);
                    Armor selectedArmor = (Armor) selectedItem;
                            player.getInventory().addArmor(selectedArmor);
                            shopArmor.remove(selectedItem);
                            System.out.println("Hai acquistato: " + selectedItem.getName());
                        }
                    }
                    else {
                        System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");

        }
    }
       else if(choice == 3){
            System.out.println("Inserisci il numero dell'oggetto che vuoi comprare!");
            int itembuy = Integer.parseInt(scanner.nextLine());
            if (itembuy <= shopConsumable.size()) {
                Consumables selectedConsumable = shopConsumable.get(choice - 1);
                int price = getConsumablePrice(selectedConsumable);
                if (money >= price) {
                    money =- price;
                    player.setMoney(money);
                    player.getInventory().addConsumables(selectedConsumable);
                    shopConsumable.remove(selectedConsumable);
                    System.out.println("Hai acquistato: " + selectedConsumable.getName());
                } else {
                    System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");
                }
            } else {
                System.out.println("Scelta non valida.");
            }
    }
}


public List<Weapon> getShopWeapons() {
    return shopWeapon;
}

public List<Armor> getShopArmors() {
    return shopArmor;
}

public List<Consumables> getShopConsumables() {
    return shopConsumable;
}

    private int getItemPrice(Item item) {
        return goldRequired + (item.getName().length() * 2); // Logica personalizzabile per i prezzi
    }

    private int getConsumablePrice(Consumables consumables) {
        return goldRequired + (consumables.getName().length() * 2); // Logica personalizzabile per i prezzi
    }

    public <T> List<T> generateRandomItems(List<T> itemList) {
        List<T> selectedItems = new ArrayList<>();
        Random random = new Random();
        
        // Se ci sono meno oggetti della quantità massima, prendili tutti
        int max = Math.min(MAX_ITEMS_PER_TYPE, itemList.size());

        for (int i = 0; i < max; i++) {
            int index = random.nextInt(itemList.size());
            selectedItems.add(itemList.remove(index)); // Evita duplicati rimuovendo gli oggetti scelti
        }

        return selectedItems;
    }
}
    
