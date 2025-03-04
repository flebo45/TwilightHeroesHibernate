package org.Model;

import jakarta.persistence.*;

import java.lang.reflect.Constructor;

@Entity
@Table(name="ROOMS")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="room_name", nullable=false)
    String name;

    @Column(name="room_description", nullable=false)
    String description;
    @Transient
    int positionX;
    @Transient
    int positionY;
    @Transient
    Consumables consumables;
    @Transient
    Weapon weapon;
    @Transient
    Armor armor;
    @Transient
    Monster monster;
    @Transient
    Trap trap;

    @Transient
    Boolean visited = false;

    public Room() {}
    public Room(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    public void setPositionX(int position){
         this.positionX = position;
        }

    public void setPositionY(int position){
        this.positionY = position;
    }

    public Consumables getConsumables() {
        return consumables;
    }

    public void setConsumables(Consumables consumables) {
        this.consumables = consumables;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void setTrap(Trap trap) {
        this.trap = trap;
    }

    public Trap getTrap() {
        return trap;
    }

    public void setshop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setshop'");
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}