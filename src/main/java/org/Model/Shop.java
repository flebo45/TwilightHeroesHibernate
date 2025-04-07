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



    /**
    public void enterShop(Player player, Scanner scanner, Master master) {
        
       
    
        // Ciclo che continua a chiedere finché l'utente non fa una scelta valida per l'acquisto
        
        while (true) { // Ciclo infinito fino a quando l'utente non esce
            // Stampa il menu solo la prima volta che entri nel ciclo
            System.out.println("Scegli una categoria di acquisto:");
            System.out.println("1. Armi");
            System.out.println("2. Armature");
            System.out.println("3. Consumabili");
            System.out.println("4. Esci");
    
            // Leggi la scelta dell'utente
            int choice = -1;
                while (true) {
                    try {
                        choice = Integer.parseInt(scanner.nextLine()); // Leggi e interpreta la scelta
                        if (choice >= 1 && choice <= 4) {
                            break; // Se la scelta è valida, esci dal ciclo
                        } else {
                            System.out.println("Scelta non valida! Inserisci un numero tra 1 e 4.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Input non valido! Inserisci un numero.");
                    }
                }

                if (choice == 1) { // Armi
                    // Non ristampare il menu, mostra direttamente le armi
                    System.out.println("Armi:");
                    int index = 1;
                    for (Item item : shopWeapon) {
                        System.out.println(index + ". " + item.getName() + " - Prezzo: " + getItemPrice(item) + " monete d'oro");
                        index++;
                    }
                    System.out.println("Inserisci il numero dell'oggetto che vuoi comprare o premi '6' per tornare al menu principale!");

                    int itembuy = -1;
                    while (true) {
                        try {
                            itembuy = Integer.parseInt(scanner.nextLine());
                            if (itembuy == 6) { // Se premi 6, torna al menu principale
                                break; // Esci dal ciclo e torna al menu principale
                            } else if (itembuy >= 1 && itembuy <= shopWeapon.size()) {
                                break; // Se la scelta è valida, continua con l'acquisto
                            } else {
                                System.out.println("Numero non valido. Inserisci un numero tra 1 e " + shopWeapon.size() + " o premi '6' per tornare.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input non valido! Inserisci un numero.");
                        }
                    }

                    if (itembuy == 6) {
                        continue; // Torna al menu principale
                    }

                    Item selectedItem = shopWeapon.get(itembuy - 1);
        int price = getItemPrice(selectedItem);
        if (money >= price) {
            money -= price;
            player.setMoney(money);
            Weapon selectedWeapon = (Weapon) selectedItem;
            player.getInventory().addWeapon(selectedWeapon);
            shopWeapon.remove(selectedItem);
            System.out.println("Hai acquistato: " + selectedItem.getName());
            System.out.println("Monete rimanenti: " + player.getMoney());
        } else {
            System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");
        }

    } else if (choice == 2) { // Armature
        System.out.println("Armature:");
        int index = 1;
        for (Item item : shopArmor) {
            System.out.println(index + ". " + item.getName() + " - Prezzo: " + getItemPrice(item) + " monete d'oro");
            index++;
        }
        System.out.println("Inserisci il numero dell'oggetto che vuoi comprare o premi '6' per tornare al menu principale!");

        int itembuy = -1;
        while (true) {
            try {
                itembuy = Integer.parseInt(scanner.nextLine());
                if (itembuy == 6) { // Se premi 6, torna al menu principale
                    break;
                } else if (itembuy >= 1 && itembuy <= shopArmor.size()) {
                    break;
                } else {
                    System.out.println("Numero non valido. Inserisci un numero tra 1 e " + shopArmor.size() + " o premi '6' per tornare.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido! Inserisci un numero.");
            }
        }

        if (itembuy == 6) {
            continue; // Torna al menu principale
        }

        Item selectedItem = shopArmor.get(itembuy - 1);
        int price = getItemPrice(selectedItem);
        if (money >= price) {
            money -= price;
            player.setMoney(money);
            Armor selectedArmor = (Armor) selectedItem;
            player.getInventory().addArmor(selectedArmor);
            shopArmor.remove(selectedItem);
            System.out.println("Hai acquistato: " + selectedItem.getName());
            System.out.println("Monete rimanenti: " + player.getMoney());
        } else {
            System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");
        }

    } else if (choice == 3) { // Consumabili
        System.out.println("Consumabili:");
        int index = 1;
        for (Consumables consumable : shopConsumable) {
            System.out.println(index + ". " + consumable.getName() + " - Prezzo: " + getConsumablePrice(consumable) + " monete d'oro");
            index++;
        }
        System.out.println("Inserisci il numero dell'oggetto che vuoi comprare o premi '6' per tornare al menu principale!");

        int itembuy = -1;
        while (true) {
            try {
                itembuy = Integer.parseInt(scanner.nextLine());
                if (itembuy == 6) { // Se premi 6, torna al menu principale
                    break;
                } else if (itembuy >= 1 && itembuy <= shopConsumable.size()) {
                    break;
                } else {
                    System.out.println("Numero non valido. Inserisci un numero tra 1 e " + shopConsumable.size() + " o premi '6' per tornare.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input non valido! Inserisci un numero.");
            }
        }

        if (itembuy == 6) {
            continue; // Torna al menu principale
        }

        Consumables selectedConsumable = shopConsumable.get(itembuy - 1);
        int price = getConsumablePrice(selectedConsumable);
        if (money >= price) {
            money -= price;
            player.setMoney(money);
            player.getInventory().addConsumables(selectedConsumable);
            shopConsumable.remove(selectedConsumable);
            System.out.println("Hai acquistato: " + selectedConsumable.getName());
            System.out.println("Monete rimanenti: " + player.getMoney());
        } else {
            System.out.println("Non hai abbastanza monete per acquistare questo oggetto!");
        }

    } else if (choice == 4) { // Esci
        master.movePlayer(); // Uscita dal negozio
        break; // Interrompe il ciclo
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
    }*/
}
    
