package org.Controller;


import org.Model.Monster;
import org.Model.Player;
import org.View.CombatView;
import org.View.GameView;


public class CombatSystem {
    private final CombatView combatView;
    private final GameView gameView;

    public CombatSystem() {
        this.gameView = new GameView();
        this.combatView = new CombatView();
    }

    public void combat(Player pg, Monster monster) {
        combatView.displayEncounter(monster);

        while (pg.getCurrentHealtPoints() > 0 && monster.getCurrentHealtPoints() > 0) {
            combatView.baseTurn(pg, monster);
            
            String input;
            do {
                input = gameView.getUserInput().trim();
                System.out.println("DEBUG: Input ricevuto -> " + input);
            } while (!isValidInput(input));

            String pgAttack = attackChoice(input, pg);
            System.out.println("DEBUG: Attacco scelto -> " + pgAttack);

            int playerRoll = pg.getAgilityRoll();
            int monsterRoll = monster.getAgilityRoll();
            combatView.agilityRoll(playerRoll, monsterRoll);
            System.out.println("DEBUG: Iniziativa - Giocatore: " + playerRoll + " vs Mostro: " + monsterRoll);

            boolean playerFirst = playerRoll >= monsterRoll;
            
            if (playerFirst) {
                playerTurn(pg, monster, pgAttack);
                if (monster.getCurrentHealtPoints() > 0) {
                    monsterTurn(pg, monster);
                }
            } else {
                monsterTurn(pg, monster);
                if (pg.getCurrentHealtPoints() > 0) {
                    playerTurn(pg, monster, pgAttack);
                }
            }
            
            System.out.println("DEBUG: HP Giocatore: " + pg.getCurrentHealtPoints() + " | HP Mostro: " + monster.getCurrentHealtPoints());
        }
    }

    private void playerTurn(Player pg, Monster monster, String pgAttack) {
        int accuracy = pg.performAttack(pgAttack);
        System.out.println("DEBUG: Precisione attacco -> " + accuracy);
        
        if (accuracy > 0) {
            int dmg = pg.dmgCounter(pg.getWeapon().getDmgP(), monster.getPhysicalDefense());
            System.out.println("DEBUG: Danno inflitto -> " + dmg);
            monster.takeDamage(dmg);
        } else {
            combatView.attackMiss(pg.getName());
        }
    }

    private void monsterTurn(Player pg, Monster monster) {
        int monsterAttack = monster.selectAttack();
        int accuracy = monster.performAttack(monsterAttack);
        System.out.println("DEBUG: Precisione attacco mostro -> " + accuracy);
        
        if (accuracy > 0) {
            int attackDmg = monster.dmgAttack(monsterAttack);
            int dmg = monster.dmgCounter(attackDmg, pg.getPhysicalDefense());
            System.out.println("DEBUG: Danno ricevuto -> " + dmg);
            pg.takeDamage(dmg);
        } else {
            combatView.attackMiss(monster.getName());
        }
    }

    private boolean isValidInput(String input) {
        return input.equals("1") || input.equals("2");
    }

    public String attackChoice(String input, Player pg) {
        return switch (input) {
            case "1" -> pg.getWeapon().getAttackP();
            case "2" -> pg.getWeapon().getAttackS();
            default -> "Error";
        };
    }

    
}

/**
public class CombatSystem {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void startCombat(Player player, Monster monster) {
        System.out.println("Inizia il combattimento!");

        while (player.getCurrentHP() > 0 && monster.getCurrentHP() > 0) { //Cambiare con HP 
            System.out.println("\nTurno del giocatore!");
            System.out.println("Scegli l'attacco:");
            System.out.println("1. " + player.getWeapon().getAttackP() + " (Danno: " + player.getWeapon().getDmgP() + ", Accuratezza: " + player.getWeapon().getPrimaryAccuracy() + ")");
            System.out.println("2. " + player.getWeapon().getAttackS() + " (Danno: " + player.getWeapon().getDmgS() + ", Accuratezza: " + player.getWeapon().getSecondaryAccuracy() + ")");

            int choice;
            do {
                System.out.print("Inserisci 1 o 2: ");
                choice = scanner.nextInt();
            } while (choice != 1 && choice != 2);

            // Determina i dettagli dell'attacco scelto
            String attackName = (choice == 1) ? player.getWeapon().getAttackP() : player.getWeapon().getAttackS();
            int attackDamage = (choice == 1) ? player.getWeapon().getDmgP() : player.getWeapon().getDmgS();
            int attackAccuracy = (choice == 1) ? player.getWeapon().getPrimaryAccuracy() : player.getWeapon().getSecondaryAccuracy();

            // Determina l'iniziativa
            int playerRoll = random.nextInt(20) + 1 + player.getAGL();
            int monsterRoll = random.nextInt(20) + 1 + monster.getAGL();

            System.out.println("\nIniziativa: Giocatore (" + playerRoll + ") vs Mostro (" + monsterRoll + ")");
            boolean playerFirst = playerRoll >= monsterRoll;

            if (playerFirst) {
                performAttack(player.getName(), attackName, attackDamage, attackAccuracy, player.getSTR(), monster);
                if (monster.getHP() > 0) {
                    performAttack(monster.getName(), monster.chooseAttackName(), monster.chooseAttackDamage(), monster.chooseAttackAccuracy(), monster.getSTR(), player);
                }
            } else {
                performAttack(monster.getName(), monster.chooseAttackName(), monster.chooseAttackDamage(), monster.chooseAttackAccuracy(), monster.getSTR(), player);
                if (player.getCurrentHP() > 0) {
                    performAttack(player.getName(), attackName, attackDamage, attackAccuracy, player.getSTR(), monster);
                }
            }

            // Stato attuale
            System.out.println("\nStato attuale:");
            System.out.println("Giocatore - Vita: " + player.getCurrentHP());
            System.out.println("Mostro - Vita: " + monster.getCurrentHP()); //da cambiare con HP
        }

        if (player.getCurrentHP() <= 0) {
            Master.gameOver();
        } else {
            System.out.println("Il mostro è stato sconfitto!");
            int money = random.nextInt(100);
            while(money < 0){
                money = random.nextInt(100);
            }
            int moneyCurrent = player.getMoney();
            moneyCurrent = moneyCurrent + money;
            player.setMoney(moneyCurrent);
            System.out.println("Hai ottenuto: " + money +" monete!");
            
        }
    }

    private static void performAttack(String attackerName, String attackName, int attackDamage, int attackAccuracy, int attackerStrength, Personage defender) {
        System.out.println(attackerName + " usa " + attackName + "!");

        // Determina se l'attacco va a segno
        int hitRoll = random.nextInt(100) + 1;
        if (hitRoll > attackAccuracy) {
            System.out.println(attackerName + " manca il bersaglio!");
            return;
        }

        // Calcolo dei danni
        int damage = attackDamage + attackerStrength - defender.getPhysic_DEF();
        damage = Math.max(damage, 0); // I danni non possono essere negativi
        System.out.println(attackerName + " infligge " + damage + " danni a " + defender.getName() + "!");
        defender.takeDamage(damage);
    }
}*/