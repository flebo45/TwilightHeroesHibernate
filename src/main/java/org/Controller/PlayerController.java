package org.Controller;


import java.util.Scanner;
import org.Model.Armor;
import org.Model.Player;
import org.Model.Weapon;

public class PlayerController {
public void pgGenerator(Player player){
        
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            // Chiedi il nome del giocatore
            String playerName = scanner.nextLine();
            player.setName(playerName);
            player.setMoney(100);
            player.setEquipArmor();
            player.setFirstInventory();
            // Chiedi la selezione dell'arma (classe)
            System.out.println("\nScegli la tua classe iniziale:");
            System.out.println("1. Guerriero");
            System.out.println("2. Ladro ");
            System.out.println("3. Mago ");
            System.out.println("4. Paladino ");
            System.out.println("5. Ranger ");
            System.out.println("6. Berserker ");
            System.out.println("7. Monaco ");
            

            
    
            int choice = -1;
            while (choice < 1 || choice > 7) {
                System.out.println("Inserisci un numero valido (1-7):");
                choice = scanner.nextInt();
            }
    
            // Assegna statistiche ed equipaggiamento in base alla scelta
            switch (choice) {
                case 1 -> {
                    // Spada
                    player.setHP(150);  
                    player.setCurrentHP(150);  
                    player.setMana(50);  
                    player.setCurrentMN(50);  
                    player.setSTR(10);  
                    player.setAGL(4);  
                    player.setPhysic_DEF(8);  
                    player.setMagic_DEF(5);  
                    player.setLuck(3);
                    String playerClass = "Guerriero" ;
                    classWeapon(playerClass, player);  
                    
                    /*da definire come vengono assegnate le armi e le armature
                    player.addItem(new Model.Item("Spada di Ferro", "Un'arma bilanciata per il combattimento ravvicinato."));
                    player.addItem(new Model.Item("Scudo di Legno", "Offre protezione aggiuntiva."));*/
            }
                case 2 -> {
                    // Arco
                    player.setHP(100);  
                    player.setCurrentHP(100);  
                    player.setMana(90);  
                    player.setCurrentMN(90);  
                    player.setSTR(7);  
                    player.setAGL(10);  
                    player.setPhysic_DEF(5);  
                    player.setMagic_DEF(6);  
                    player.setLuck(8);
                    String playerClass = "Ladro" ;
                    classWeapon(playerClass, player);  
                    /*da definire come vengono assegnate le armi e le armature
                    player.addItem(new Model.Item("Arco di Legno", "Un'arma agile per il combattimento a distanza."));
                    player.addItem(new Model.Item("Freccia", "Munizioni per l'arco."));*/
            }
                case 3 -> {
                    // Bacchetta magica
                        player.setHP(80);  
                        player.setCurrentHP(80);  
                        player.setMana(200);  
                        player.setCurrentMN(200);  
                        player.setSTR(3);  
                        player.setAGL(5);  
                        player.setPhysic_DEF(3);  
                        player.setMagic_DEF(12);  
                        player.setLuck(6);
                        String playerClass = "Mago" ;
                        classWeapon(playerClass, player);  
                    /*da definire come vengono assegnate le armi e le armature
                    player = new Model.Player(playerName, 80, 8, 5, 30);
                    player.addItem(new Model.Item("Bacchetta Magica", "Perfetta per lanciare incantesimi."));
                    player.addItem(new Model.Item("Libro degli Incantesimi", "Contiene formule magiche."));*/
            }

                    case 4 -> {
                        // Bacchetta magica
                        player.setHP(130);  
                        player.setCurrentHP(130);  
                        player.setMana(100);  
                        player.setCurrentMN(100);  
                        player.setSTR(8);  
                        player.setAGL(5);  
                        player.setPhysic_DEF(10);  
                        player.setMagic_DEF(8);  
                        player.setLuck(4);
                        String playerClass = "Paladino" ;
                        classWeapon(playerClass, player);  
                             /*da definire come vengono assegnate le armi e le armature
                        player = new Model.Player(playerName, 80, 8, 5, 30);
                        player.addItem(new Model.Item("Bacchetta Magica", "Perfetta per lanciare incantesimi."));
                        player.addItem(new Model.Item("Libro degli Incantesimi", "Contiene formule magiche."));*/
                }
                    case 5 -> {
                        // Bacchetta magica
                        player.setHP(110);  
                        player.setCurrentHP(110);  
                        player.setMana(70);  
                        player.setCurrentMN(70);  
                        player.setSTR(8);  
                        player.setAGL(9);  
                        player.setPhysic_DEF(6);  
                        player.setMagic_DEF(5);  
                        player.setLuck(7);
                        String playerClass = "Guerriero" ;
                        classWeapon(playerClass, player);  
                        /*da definire come vengono assegnate le armi e le armature
                        player = new Model.Player(playerName, 80, 8, 5, 30);
                        player.addItem(new Model.Item("Bacchetta Magica", "Perfetta per lanciare incantesimi."));
                        player.addItem(new Model.Item("Libro degli Incantesimi", "Contiene formule magiche."));*/
                }
                    case 6 -> {
                        // Bacchetta magica
                        player.setHP(160);  
                        player.setCurrentHP(160);  
                        player.setMana(30);  
                        player.setCurrentMN(30);  
                        player.setSTR(12);  
                        player.setAGL(6);  
                        player.setPhysic_DEF(7);  
                        player.setMagic_DEF(3);  
                        player.setLuck(5);
                        String playerClass = "Guerriero" ;
                        classWeapon(playerClass, player);  
                        /*da definire come vengono assegnate le armi e le armature
                        player = new Model.Player(playerName, 80, 8, 5, 30);
                        player.addItem(new Model.Item("Bacchetta Magica", "Perfetta per lanciare incantesimi."));
                        player.addItem(new Model.Item("Libro degli Incantesimi", "Contiene formule magiche."));*/
                }
                    case 7 -> {
                        player.setHP(120);  
                        player.setCurrentHP(120);  
                        player.setMana(100);  
                        player.setCurrentMN(100);  
                        player.setSTR(7);  
                        player.setAGL(8);  
                        player.setPhysic_DEF(8);  
                        player.setMagic_DEF(7);  
                        player.setLuck(6);
                        String playerClass = "Guerriero" ;
                        classWeapon(playerClass, player);                        /*da definire come vengono assegnate le armi e le armature
                        player = new Model.Player(playerName, 80, 8, 5, 30);
                        player.addItem(new Model.Item("Bacchetta Magica", "Perfetta per lanciare incantesimi."));
                        player.addItem(new Model.Item("Libro degli Incantesimi", "Contiene formule magiche."));*/
                    }
            }
        }
    public void pgHeal(int healthRestored, int manaRestored, Player player){
        player.setCurrentHP(healthRestored + player.getCurrentHP());
        if (player.getCurrentHP() > player.getHP()){ player.setCurrentHP(player.getHP());}
        player.setCurrentMN(manaRestored + player.getCurrentMN());
        if (player.getCurrentMN() > player.getMana()){ player.setCurrentMN(player.getMana());}
    }

    public void getStatus(Player player) {
        System.out.println("Statistiche di:" + player.getName() );
        System.out.println("-HP: " + player.getCurrentHP() + "/" + player.getHP() );
        System.out.println("-Mana: " + player.getCurrentMN() + "/" + player.getMana() );
        System.out.println("-Forza: " + player.getSTR());
        System.out.println("-Agilita`: " + player.getAGL() );
        System.out.println("-Difesa: " + player.getPhysic_DEF());
        System.out.println("- Difesa magica: " + player.getMagic_DEF() );
        System.out.println("-Fortuna: " + player.getLuck() );
        System.out.println("-Monete: " + player.getMoney() );


    }

    public void classWeapon(String type, Player player){
    Weapon weapon;
    Armor helm;
    Armor chestplate;
    Armor gauntlet;
    Armor leggins;
    switch (type) {
        case "Guerriero":
            weapon = new Weapon("Spada arrugginita", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo Arrugginito", "Un vecchio elmo di metallo ormai arrugginito, ma ancora abbastanza resistente.", "setbase", "elmo", 3, "difesa_fisica");
            chestplate = new Armor("Corazza Logora", "Una corazza di cuoio vecchio e consumato, ma ancora utile per proteggere.", "setbase", "corazza", 4, "difesa_fisica");
            gauntlet = new Armor("Guanti Deteriorati", "Guanti di cuoio logorati dalla fatica, ma ancora abbastanza resistenti per bloccare gli attacchi.", "setbase", "guanti", 1, "difesa_fisica");
            leggins = new Armor("Gambali Consunti", "Un paio di gambali di metallo usurati dal tempo, che offrono una protezione minima.", "setbase", "gambali", 2, "difesa_fisica");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);

            break;


        case "Ladro":
            weapon = new Weapon("pugnale arrugginita", null , "Attaccoa", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor("Elmo di Stoffa", "Un semplice elmo di stoffa, leggero ma quasi privo di protezione.", "setbase", "elmo", 1, "agilita");
            chestplate = new Armor("Corazza Logora", "Una corazza di pelle morbida ma resistente, ottima per la velocità e la destrezza.", "setbase", "corazza", 2, "agilita");
            gauntlet = new Armor("Guanti Semplici", "Guanti di tela sottili che permettono una maggiore destrezza nelle azioni furtive.", "setbase", "guanti", 2, "agilita");
            leggins = new Armor("Gambali Sfilacciati", "Gambali leggeri in cuoio, ideali per non compromettere la mobilità.", "setbase", "gambali", 3, "agilita");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;


        case "Mago":
            weapon = new Weapon("bacchetta rotta", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo di Legno Usato", "Un semplice elmo di legno, che offre poca protezione ma una leggera resistenza magica.", "setbase", "elmo", 1, "difesa_magica");
            chestplate = new Armor("Corazza di Lino Stinto", "Una tunica di lino che offre una protezione minima, ma che non ostacola i movimenti.", "setbase", "corazza", 2, "difesa_magica");
            gauntlet = new Armor("Guanti di Cotone", "Guanti di cotone morbido, ideali per manipolare artefatti magici senza rischio di danneggiarli.", "setbase", "guanti", 1, "difesa_magica");
            leggins = new Armor("Gambali di Panno", "Gambali di panno morbido, che non offrono molta protezione, ma sono leggeri.", "setbase", "gambali", 1, "difesa_magica");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;
         

        case "Paladino":
            weapon = new Weapon("Spada dimenticata", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo di Ferro Deteriorato", "Un elmo di ferro consumato dal tempo, che protegge poco ma è meglio di nulla.", "setbase", "elmo", 3, "difesa_fisica");
            chestplate = new Armor("Corazza di Cuoio Rovinata", "Una corazza di cuoio rovinata che offre una protezione limitata.", "setbase", "corazza", 4, "difesa_fisica");
            gauntlet = new Armor("Guanti di Pelle Strappata", "Guanti di pelle strappata che non proteggono bene, ma sono abbastanza resistenti.", "setbase", "guanti", 2, "difesa_fisica");
            leggins = new Armor("Gambali di Metallo Usurato", "Gambali di metallo usurato, poco efficaci ma abbastanza resistenti per brevi periodi.", "setbase", "gambali", 2, "difesa_fisica");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;
          
            
        case "Ranger":
            weapon = new Weapon("Arco", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo di Tela", "Un elmo di tela che non offre molta protezione, ma è leggero e confortevole.", "setbase", "elmo", 1, "agilita");
            chestplate = new Armor("Corazza di Pelle Consumata", "Corazza di pelle consumata che non offre molta difesa, ma è sufficientemente flessibile.", "setbase", "corazza", 2, "agilita");
            gauntlet = new Armor("Guanti di Pelle Deteriorata", "Guanti di pelle deteriorata che non offrono molta protezione, ma non ostacolano i movimenti.", "setbase", "guanti", 2, "agilita");
            leggins = new Armor("Gambali di Cuoio Usurato", "Gambali di cuoio usurato che non proteggono molto, ma sono abbastanza comodi per correre.", "setbase", "gambali", 2, "agilita");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;
            
        case "Berserker":
            weapon = new Weapon("Spadone spezzato", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo di Ferro Arrugginito", "Un elmo di ferro arrugginito, pesante e poco resistente, ma protezione minima garantita.", "setbase", "elmo", 4, "forza");
            chestplate = new Armor("Corazza di Ferro Rovinato", "Corazza di ferro rovinata, che offre una protezione debole ma consente una buona forza d'attacco.", "setbase", "corazza", 5, "forza");
            gauntlet = new Armor("Guanti di Cuoio Spesso", "Guanti di cuoio spesso che proteggono poco, ma offrono una presa forte per le armi.", "setbase", "guanti", 2, "forza");
            leggins = new Armor("Gambali di Metallo Usurato", "Gambali di metallo usurato che non offrono grande protezione, ma danno una buona base per i combattimenti ravvicinati.", "setbase", "gambali", 3, "forza");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;


        case "Monaco":
            weapon = new Weapon("Tirapugni arrugginito", null , "Fendente ", "Affondo", 15, 20, 90, 75);
            player.setWeapon(weapon);

            helm = new Armor ("Elmo Sbiadito", "Un elmo di metallo leggero, ormai arrugginito e poco efficace.", "setbase", "elmo", 1, "difesa_fisica");
            chestplate = new Armor("Tunica Consumata", "Una tunica che ha visto giorni migliori, ormai sbiadita e con pochi segni di protezione.", "setbase", "corazza", 1, "difesa_fisica");
            gauntlet = new Armor("Guanti Scuri", "Guanti di stoffa rovinata, non offrono protezione ma consentono una certa libertà nei combattimenti.", "setbase", "guanti", 1, "agilita");
            leggins = new Armor("Gambali Consumati", "Gambali in tela che si sono deteriorati con il tempo, non adatti a difese ma comodi per il movimento.", "setbase", "gambali", 1, "agilita");

            equipArmorPiece(helm, player);
            equipArmorPiece(chestplate, player);
            equipArmorPiece(gauntlet, player);
            equipArmorPiece(leggins, player);
            break;
        }
    }  
    
    
    public void equipArmorPiece(Armor newArmor, Player player) {
        if (newArmor == null) {
            System.out.println("Errore: Nessuna armatura da equipaggiare.");
            return;
        }

        // Recupera il pezzo dell'armatura da sostituire
        String part = newArmor.getPart();
        Armor currentArmor = player.getEquipArm().get(part);

        // Applica la rimozione del bonus per l'armatura precedente
        if (currentArmor != null) {
            removeArmorBonus(currentArmor, player);
        }

        // Applica il bonus della nuova armatura
        applyArmorBonus(newArmor, player);

        // Sostituisci l'armatura equipaggiata per il pezzo specificato
        player.getEquipArm().put(part, newArmor);

        System.out.println("Equipaggiato: " + newArmor.getName() + " al posto di " + (currentArmor != null ? currentArmor.getName() : "niente"));
    }

    // Metodo per applicare il bonus di un'armatura (aggiorna la statistica del giocatore)
    public void applyArmorBonus(Armor armor, Player player) {
        if (armor == null) return;

        switch (armor.getStatEnch().toLowerCase()) {
            case "forza":
                int str = player.getSTR() + armor.getStat();
                player.setSTR(str);
                break;
            case "agilità":
                int agl = player.getAGL() + armor.getStat();
                player.setSTR(agl);
                break;
            case "difesa fisica":
                int def = player.getPhysic_DEF() + armor.getStat();
                player.setSTR(def);
                break;
            case "difesa magica":
                int defM = player.getMagic_DEF() + armor.getStat();
                player.setSTR(defM);
                break;
        }
    }

    // Metodo per rimuovere il bonus di un'armatura (quando viene cambiata)
    public void removeArmorBonus(Armor armor, Player player) {
        if (armor == null) return;

        switch (armor.getStatEnch().toLowerCase()) {
            case "forza":
                int str = player.getSTR() - armor.getStat();
                player.setSTR(str);
                break;
            case "agilità":
                int agl = player.getAGL() - armor.getStat();
                player.setSTR(agl);
                break;
            case "difesa fisica":
                int def = player.getPhysic_DEF() - armor.getStat();
                player.setSTR(def);
                break;
            case "difesa magica":
                int defM = player.getMagic_DEF() - armor.getStat();
                player.setSTR(defM);
                break;
        }
    }

    
}
