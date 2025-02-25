package org.Model;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Entity
@DiscriminatorValue("PLAYER")
public class Player extends Personage {
    @Column(nullable = false)
    private int mana;

    @Column(nullable = false)
    private int luck;

    @Transient
    private int Money;

    @Transient
    private Weapon weapon;

    @Transient
    private Inventory inventory;

    @Transient
    private int currentMN; 

    @Transient
    private Map<String, Armor> equippedArmor;

    
    public Player() {}
    
   public void setEquipArmor(){
    this.equippedArmor = new HashMap<>();
   }

   public Map<String, Armor> getEquipArm(){
    return equippedArmor;
   }

   public void setFirstInventory(){
    this.inventory = new Inventory();
   }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

   
    public int getMoney() {
        return Money;
    }

    public void setMoney(int Money) {
        this.Money = Money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    public int getCurrentMN() {
        return currentMN;
    }

    public void setCurrentMN(int currentMN) {
        this.currentMN = currentMN;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
   



    





