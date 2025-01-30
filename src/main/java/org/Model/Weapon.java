package org.Model;


public class Weapon extends Item{
    private String AttackP;
    private String AttackS;
    private int dmgP;
    private int dmgS;
    private int accuracyP;
    private int accuracyS;

    public int getPrimaryAccuracy() {
        return accuracyP;
    }

    public void setPrimaryAccuracy(int accuracyP) {
        this.accuracyP = accuracyP;
    }

    public int getSecondaryAccuracy() {
        return accuracyS;
    }

    public void setSecondaryAccuracy(int accuracyS) {
        this.accuracyS = accuracyS;
    }


    public String getAttackP() {
        return AttackP;
    }

    public void setAttackP(String AttackP) {
        this.AttackP = AttackP;
    }

    public String getAttackS() {
        return AttackS;
    }

    public void setAttackS(String AttackS) {
        this.AttackS = AttackS;
    }

    public int getDmgP() {
        return dmgP;
    }

    public void setDmgP(int dmgP) {
        this.dmgP = dmgP;
    }

    public int getDmgS() {
        return dmgS;
    }

    public void setDmgS(int dmgS) {
        this.dmgS = dmgS;
    }

    public Weapon( String name, String  description, String attackP, String  attackS, int dmgP, int dmgS, int accuracy1 , int accuracy2){
        this.name = name;
        this.description = description;
        this.AttackP = attackP;
        this.AttackS = attackS;
        this.dmgP = dmgP;
        this.dmgS = dmgS;
        this.accuracyP = accuracy1;
        this.accuracyS = accuracy2;

    }
}