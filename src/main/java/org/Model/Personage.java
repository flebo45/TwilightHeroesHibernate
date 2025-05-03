package org.Model;

import java.util.Random;

//import jakarta.persistence.*;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

@MappedSuperclass
public abstract class Personage {
    protected static final Random random = new Random();

    protected String name;
    protected int healtPoints;
    protected int strength;
    protected int magicDefense;
    protected int physicalDefense;
    protected int agility;
    protected int mana;
    protected int luck;
    protected int currentHealtPoints;

    @Transient
    protected Room position;

    public Personage() {}

    public Personage(String name, int hp, int str, int magicDef, int physicDef, int agl, int mana, int luck) {
        this.name = name;
        this.healtPoints = hp;
        this.strength = str;
        this.magicDefense = magicDef;
        this.physicalDefense = physicDef;
        this.agility = agl;
        this.mana = mana;
        this.luck = luck;
        this.currentHealtPoints = hp;
    }

    public String getName() {
        return this.name;
    }
    public int getHealtPoints() {
        return this.healtPoints;
    }
    public int getStrength() {
        return this.strength;
    }
    public int getMagicDefense() {
        return this.magicDefense;
    }
    public int getPhysicalDefense() {
        return this.physicalDefense;
    }
    public int getAgility() {
        return this.agility;
    }
    public int getMana() {
        return this.mana;
    }
    public int getLuck() {
        return this.luck;
    }
    public int getCurrentHealtPoints() {
        return this.currentHealtPoints;
    }
    public Room getPosition() {
        return this.position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealtPoints(int hp) {
        this.healtPoints = hp;
    }
    public void setStrength(int str) {
        this.strength = str;
    }
    public void setMagicDefense(int magicDef) {
        this.magicDefense = magicDef;
    }
    public void setPhysicalDefense(int physicDef) {
        this.physicalDefense = physicDef;
    }
    public void setAgility(int agl) {
        this.agility = agl;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public void setCurrentHealtPoints(int currentHealtPoints) {
        this.currentHealtPoints = currentHealtPoints;
    }
    public void setPosition(Room position) {
        this.position = position;
    }
    public void takeDamage(int damage) {
        this.currentHealtPoints -= damage;
        if (this.currentHealtPoints <= 0) this.currentHealtPoints = 0;
    }

    public void heal(int heal) {
        if(this.currentHealtPoints + heal > this.healtPoints) this.currentHealtPoints = healtPoints;
        else this.currentHealtPoints += heal;
    }
    

    
    public int getAgilityRoll(){
        int value = this.agility + random.nextInt(20) + 1;
        return value;
    }

    public int dmgCounter(int dmgAttack, int def){
        int dmg = dmgAttack + this.strength - def;
        dmg = Math.max(dmg, 0);
        return dmg;
    }


}

