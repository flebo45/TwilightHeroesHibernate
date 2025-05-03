package org.Model;



import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("status")
public class ConsumableStatus extends Consumables {

    private int healthRestored; 
    private int manaRestored;

    public ConsumableStatus() {}

    public ConsumableStatus(String name, String description, int healthRestored, int manaRestored) {
        super(name, description);
        this.healthRestored = healthRestored;
    }

    public int getHeal(){
        return this.healthRestored;
    }

    public int getMana(){
        return this.manaRestored;
    }

    public String toString(){
        return super.toString() + "Health: " + this.healthRestored + " Mana: " + this.manaRestored;
    }
}