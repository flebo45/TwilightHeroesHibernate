package org.Model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "CHARACTERS")
public class Personage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    protected int HP;

    @Column(nullable = false)
    protected int STR;

    @Transient
    protected int currentHP;

    @Column(nullable = false)
    protected int magic_DEF;

    @Column(nullable = false)
    protected int physic_DEF;

    @Column(nullable = false)
    protected int AGL;

    @Transient
    protected  Room position;

    public Personage() {}


    public Room getPosition() {
        return position;
    }

    public void setPosition(Room position) {
        this.position = position;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getMagic_DEF() {
        return magic_DEF;
    }

    public void setMagic_DEF(int magic_DEF) {
        this.magic_DEF = magic_DEF;
    }

    public int getPhysic_DEF() {
        return physic_DEF;
    }

    public void setPhysic_DEF(int physic_DEF) {
        this.physic_DEF = physic_DEF;
    }
    public int getAGL() {
        return AGL;
    }

    public void setAGL(int AGL) {
        this.AGL = AGL;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int cuurentHP) {
        this.currentHP = cuurentHP;
    }

    public void takeDamage(int damage) {
        int HP = getCurrentHP();
        setCurrentHP(HP - damage); 

    }

}
