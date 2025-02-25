package org.Model;

import org.Controller.PlayerController;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("status")
public class ConsumableStatus extends Consumables {
    @SuppressWarnings("FieldMayBeFinal")
    private int healthRestored; 
    private int manaRestored;

    public ConsumableStatus() {}

    public ConsumableStatus(String name, String description, int healthRestored, int manaRestored) {
        super(name, description);
        this.healthRestored = healthRestored;
    }

    @Override
    public void consume(Player player) {
       PlayerController.pgHeal(healthRestored, manaRestored, player);
        if(healthRestored == 0){
        System.out.println("Hai consumato " + name + ". Mana ripristinata di " + manaRestored + " punti.");
        }
        if(manaRestored == 0){
            System.out.println("Hai consumato " + name + ". Hp ripristinata di " + healthRestored+ " punti.");
        }
        else{
            System.out.println("Hai consumato " + name + ". Hp e Mana ripristinati di " +manaRestored + " e " + healthRestored + " punti.");
        }
    }
}