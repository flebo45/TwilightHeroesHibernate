package org.Model;

import jakarta.persistence.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Entity
@Table(name = "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int healthPoints;

    @Column(nullable = false)
    private int strength;

    @Column(nullable = false)
    private int magicDefense;

    @Column(nullable = false)
    private int physicalDefense;

    @Column(nullable = false)
    private int agility;

    @Column(nullable = false)
    private int mana;

    @Column(nullable = false)
    private int luck;

    @OneToOne
    private Weapon weapon;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "character_armor", joinColumns = @JoinColumn(name = "character_id"))
    @MapKeyColumn(name = "armor_type")
    private Map<String, Armor> armor;

    public Character() {
        this.armor = new HashMap<>();
    }

    public Character(String name, int healthPoints, int strength, int magicDefense, int physicalDefense, int agility, int mana, int luck, Weapon weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.magicDefense = magicDefense;
        this.physicalDefense = physicalDefense;
        this.agility = agility;
        this.mana = mana;
        this.luck = luck;
        this.weapon = weapon;
        this.armor = new HashMap<String, Armor>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealthPoints() {
        return this.healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int getStrength() {
        return this.strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getMagicDefense() {
        return this.magicDefense;
    }
    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }
    public int getPhysicalDefense() {
        return this.physicalDefense;
    }
    public void setPhysicalDefense(int physicalDefense) {
        this.physicalDefense = physicalDefense;
    }
    public int getAgility() {
        return this.agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getMana() {
        return this.mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getLuck() {
        return this.luck;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public Map<String, Armor> getArmor() {
        return this.armor;
    }
    public void setArmor(Map<String, Armor> armor) {
        this.armor = armor;
    }



}
