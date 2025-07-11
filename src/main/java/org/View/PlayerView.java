package org.View;

import org.Model.Consumables;
import org.Model.Player;


public class PlayerView {

    public PlayerView() {
    }

    public void playerName(){
        System.out.println("Seleziona il nome del tuo personagio:");
    }

    public void showCharactersMenu(){
        System.out.println("\nScegli la tua classe iniziale:");
        System.out.println("1. Guerriero");
        System.out.println("2. Ladro ");
        System.out.println("3. Mago ");
        System.out.println("4. Paladino ");
        System.out.println("5. Ranger ");
        System.out.println("6. Berserker ");
        System.out.println("7. Monaco ");
    }

    public void showPlayerActions(){
        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Muoviti");
        System.out.println("2. Esamina la stanza");
        System.out.println("3. Controlla l'inventario");
        System.out.println("4. Controlla lo status del personaggio");
        System.out.println("5. Esci dal gioco");
    }

    public void showDirections(){
        System.out.println("\nDove vuoi andare?");
        System.out.println("Usa W (su), A (sinistra), S (giù), D (destra) per muoverti.");
    }

    public void showPlayerStatus(Player player){
        System.out.println("\nQuesto è il tuo personaggio: ");
        System.out.println("=====================================");
        System.out.println("Nome: " + player.getUsername());
        System.out.println("Classe: " + player.getName());
        System.out.println("=====================================");
        System.out.println("Attributi: ");
        System.out.println("HP: " + player.getCurrentHealtPoints() + "/" + player.getHealtPoints());
        System.out.println("STR: " + player.getFinalAttribute("forza") + "(" + player.getStrength() + " + " + player.getArmor().getBonus("forza") + ")");
        System.out.println("MAGIC_DEF: " + player.getFinalAttribute("difesa_magica") + "(" + player.getMagicDefense() + " + " + player.getArmor().getBonus("difesa_magica") + ")");
        System.out.println("PHYSICAL_DEF: " + player.getFinalAttribute("difesa_fisica") + "(" + player.getPhysicalDefense() + " + " + player.getArmor().getBonus("difesa_fisica") + ")");
        System.out.println("AGL: " + player.getFinalAttribute("agilita") + "(" + player.getAgility() + " + " + player.getArmor().getBonus("agilita") + ")");
        System.out.println("MANA: " + player.getCurrentMana() + "/" + player.getMana());
        System.out.println("LUCK: " + player.getLuck());
        System.out.println("MONEY: " + player.getMoney());
        System.out.println("=====================================");
        System.out.println("Arma equipaggiata: ");
        System.out.println(player.getWeapon());
        System.out.println("====================================");
        System.out.println("Armatura equipaggiata: ");
        System.out.println(player.getArmor());
        System.out.println("===================================");
    }

    public void showPlayerInventory(Player player){
        System.out.println("\nQuesto è il tuo inventario: ");
        System.out.println("=====================================");
        System.out.println("Lista oggetti: ");
        System.out.println(player.getInventory().getItemList());
        System.out.println("====================================");
        System.out.println("Lista dei consumabili: ");
        System.out.println(player.getInventory().getConsumables());
        System.out.println("===================================");
    }


    public void askForaction(){
        System.out.println("Vuoi utilizzare un consumabile o equipaggiare un oggetto?");
        System.out.println("1. consumabile");
        System.out.println("2. oggetto");
        System.out.println("3. annulla");

    }

    public void showItem(Player player){
        System.out.println("Cosa vuoi equipaggiare?");
    }

    public void showConsumable(Player player){
        System.out.println(player.getInventory().getConsumables());
    }

    public void noItem(){
        System.out.println("Nessun item nell'inventario");
    }

    public void noConsumables(){
        System.out.println("Nessun consumabile nell'inventario");
    }

    public void showItemList(Player player) {
        System.out.println("Oggetti disponibili: ");
        for (int i = 0; i < player.getInventory().getItemList().size(); i++) {
            System.out.println((i + 1) + ". " + player.getInventory().getItemList().get(i).getName());
        }
    }

    public void showConsumableList(Player player) {
        System.out.println("Consumabili disponibili: ");
        for (int i = 0; i < player.getInventory().getConsumables().size(); i++) {
            System.out.println((i + 1) + ". " + player.getInventory().getConsumables().get(i).getName());
        }
    }

    public void useConsumable(Consumables consumables) {
       System.out.println("Hai utilizzato: "+consumables.toString());
    }

    public void newEquipped(String nome){
        System.out.println("hai equipaggiato: " + nome);
    }

}
