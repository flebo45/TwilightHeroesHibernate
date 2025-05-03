package org.Model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("special")
public class ConsumableSpecial extends Consumables {
    private String effectType;

    public ConsumableSpecial() {}

    public ConsumableSpecial(String name, String description, String effectType) {
        super(name, description);
        this.effectType = effectType;
    }

    public String getEffectType() {
        return this.effectType;
    }

    public String toString(){
        return super.toString() + "\nEffect Type: " + effectType;
    }
}
