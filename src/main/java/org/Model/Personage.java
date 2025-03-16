package org.Model;

//import jakarta.persistence.*;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

@MappedSuperclass
public abstract class Personage {
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




}

/**
 * @Entity
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * @DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
 * @Table(name = "CHARACTERS")
 * public class Personage {
 *     @Id
 *     @GeneratedValue(strategy = GenerationType.IDENTITY)
 *     protected Long id;
 *
 *     @Column(nullable = false)
 *     protected String name;
 *
 *     @Column(nullable = false)
 *     protected int HP;
 *
 *     @Column(nullable = false)
 *     protected int STR;
 *
 *     @Transient
 *     protected int currentHP;
 *
 *     @Column(nullable = false)
 *     protected int magic_DEF;
 *
 *     @Column(nullable = false)
 *     protected int physic_DEF;
 *
 *     @Column(nullable = false)
 *     protected int AGL;
 *
 *     @Transient
 *     protected  Room position;
 *
 *     public Personage() {}
 *
 *
 *     public Room getPosition() {
 *         return position;
 *     }
 *
 *     public void setPosition(Room position) {
 *         this.position = position;
 *     }
 *     public String getName() {
 *         return name;
 *     }
 *
 *     public void setName(String name) {
 *         this.name = name;
 *     }
 *
 *     public int getHP() {
 *         return HP;
 *     }
 *
 *     public void setHP(int HP) {
 *         this.HP = HP;
 *     }
 *
 *     public int getSTR() {
 *         return STR;
 *     }
 *
 *     public void setSTR(int STR) {
 *         this.STR = STR;
 *     }
 *
 *     public int getMagic_DEF() {
 *         return magic_DEF;
 *     }
 *
 *     public void setMagic_DEF(int magic_DEF) {
 *         this.magic_DEF = magic_DEF;
 *     }
 *
 *     public int getPhysic_DEF() {
 *         return physic_DEF;
 *     }
 *
 *     public void setPhysic_DEF(int physic_DEF) {
 *         this.physic_DEF = physic_DEF;
 *     }
 *     public int getAGL() {
 *         return AGL;
 *     }
 *
 *     public void setAGL(int AGL) {
 *         this.AGL = AGL;
 *     }
 *
 *     public int getCurrentHP() {
 *         return currentHP;
 *     }
 *
 *     public void setCurrentHP(int cuurentHP) {
 *         this.currentHP = cuurentHP;
 *     }
 *
 *     public void takeDamage(int damage) {
 *         int HP = getCurrentHP();
 *         setCurrentHP(HP - damage);
 *
 *     }
 *
 * }
 */

