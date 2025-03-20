package org.Model;

import jakarta.persistence.*;

@Entity
@Table(name= "TRAPS")
public class Trap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trap_name", nullable = false)
    private String name;

    @Column(name = "trap_description", nullable = false)
    private String description;

    @Column(name = "trap_skillCheck", nullable = false)
    private String description2;

    @Column(nullable = false)
    private int damage;

    @Column(nullable = false)
    private int value;

    @Column(nullable = false)
    private String stat;

    @Column(nullable = false)
    private String success;

    @Column(nullable = false)
    private String failure;

    public Trap() {}

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



    public boolean resolveTrap(int playerStat, int roll){
        int total = roll + playerStat;
        if (total >= getValue()) {
            return true;
        } else {
            return false;
        }
    }

  
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
