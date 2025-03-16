package org.Model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
@DiscriminatorValue("time")
public class ConsumableTime extends Consumables {
    private String effectType;
    private int value;
    private int duration;

    @Transient
    private int statValue;

    @Transient
    private int Statsminus;

    @Transient
    private int StatsPlus;

    @Transient
    private String Stats1 ;

    @Transient
    private String Stats2;

    public ConsumableTime() {}

    public ConsumableTime(String name, String description, String effectType, int value, int duration) {
        super(name, description);
        this.effectType = effectType;
        this.value = value;
        this.duration = duration;
        
    }

    /**@Override
    public void consume(Player player , PlayerController pgController) {
        //player.applyTemporaryEffect(effectType, value, duration);
        System.out.println("Hai consumato " + name + ". Effetto " + effectType + " attivo per " + duration + " turni.");
    }*/
}
