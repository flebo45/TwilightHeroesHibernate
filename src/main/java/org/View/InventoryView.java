package org.View;

import java.util.List;
import java.util.Scanner;
import org.Model.Consumables;
import org.Model.Item;


public class InventoryView {

    private static Scanner scanner = new Scanner(System.in);
    
    public static String InvView(List<Consumables> inventoryCons, List<Item> inventoryItem){
            System.out.println("Inventario:");
            // Ottieni l'inventario del giocatore
            if (inventoryCons.isEmpty() && inventoryItem.isEmpty()) {
                System.out.println("Il tuo inventario è vuoto.");
                return null;
            } else if (inventoryItem.isEmpty()) {
                // Itera sull'inventario
                System.out.println("-Consuambili:");
                for (int i = 0; i < inventoryCons.size(); i++) {
                    System.out.println((i + 1) + ". " + inventoryCons.get(i).toString());
                }
                System.out.println("Vuoi utilizzare un consumabile?");
                System.out.println("1. Si");
                System.out.println("2. No");
                String action = scanner.nextLine();
                return action;
            }
            else if(inventoryCons.isEmpty()){
                System.out.println("-Oggetti:");
                for (int i= 0; i< inventoryItem.size(); i++) {
                    System.out.println((i+1) + ". " + inventoryItem.get(i).toString());
                }
                System.out.println("Vuoi equiapggiare una nuova armatura o arma?");
                System.out.println("1. Si");
                System.out.println("2. No");
                String action = scanner.nextLine();
                return action;
            }
            else{
                System.out.println("-Consuambili");
                for (int i = 0; i < inventoryCons.size(); i++) {
                    System.out.println((i + 1) + ". " + inventoryCons.get(i).toString());
                }
                System.out.println("\n");
                System.out.println("-Oggetti:");
                for (int i= 0; i< inventoryItem.size(); i++) {
                    System.out.println((i+1) + ". " + inventoryItem.get(i).toString());
                }
                System.out.println("\n");
                System.out.println("Vuoi utilizzare un consumabile o equipaggiare un oggetto?");
                System.out.println("1. consumabile");
                System.out.println("2. equipaggiamento");
                String action = scanner.nextLine();
                return action;
            }
        }

        public static Consumables UseConsumable(List<Consumables> inventoryCons){

            System.out.println("Seleziona il numero del consumabile da utilizzare:");
            int selectedIndex;
            
            try {
                selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;
    
                if (selectedIndex >= 0 && selectedIndex < inventoryCons.size()) {
                    // Recupera l'oggetto selezionato
                    Consumables selectedConsumable = inventoryCons.get(selectedIndex);
                    System.out.println("Hai scelto: " + selectedConsumable.toString());
                    return selectedConsumable;
                } else {
                    System.out.println("Scelta non valida.");
                    return null;
                }
            } catch (NumberFormatException e) {
                System.out.println("Inserisci un numero valido.");
            }
                        return null;
        }
    }
    
