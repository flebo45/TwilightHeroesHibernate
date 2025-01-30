package org.Model;

import java.util.Random;

public class Trap {
    private String name;
    private String description;
    private String description2;
    private int damage;
    private int value;
    private String stat;
    private String success;
    private String failure;
                    
    public Trap(String name, String description, int dmg,String stat, int roll,String desc, String success, String failure){
        this.name = name;
        this.description = description;
        this.damage = dmg;
        this.stat = stat;
        this.value = roll;
        this.description2 = desc;
        this.success = success;
        this.failure = failure;
    }
    
    public String getSuccess() {
        return success;
    }

    public void setSucces(String success) {
        this.success = success;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description) {
        this.description2 = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int roll) {
        this.value = roll;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean resolveTrap(Player player){
        System.out.println("hai trovato nel tuo percorso: " + getName() + "!");
        System.out.println(getDescription());
        System.out.println(getDescription2());
        Random random = new Random();
        int roll = random.nextInt(20) + 1;
        int playerStat = getPlayerStat(player); // Ottiene la statistica corrispondente
        int total = roll + playerStat;

        System.out.println("Hai tirato: " + roll + " + " + playerStat + " (" + stat.toUpperCase() + ") = " + total);

        if (total >= getValue()) {
            System.out.println(getSuccess());
            return true;
        } else {
            System.out.println(getFailure()+ "\nSubisci " + damage + " danni!");
            player.takeDamage(damage);
            return false;
        }
    }

    private int getPlayerStat(Player player) {
        switch (stat.toLowerCase()) {
            case "agl": return player.getAGL();
            case "str": return player.getSTR();
            case "magic_d": return player.getMagic_DEF();
            case "luck" : return player.getLuck();
            default: return 0; // Se la statistica non è riconosciuta, assume 0
        }
    }

    }
