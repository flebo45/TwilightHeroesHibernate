package org.Model;

import jakarta.persistence.*;

import java.util.Random;

@Entity
@Table(name = "monsters")
public class Monster extends Personage{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String attack1;

    @Column(nullable = false)
    private int accuracy1;

    @Column(nullable = false)
    private int damage1;

    @Column(nullable = false)
    private String attack2;

    @Column(nullable = false)
    private int accuracy2;

    @Column(nullable = false)
    private int damage2;

    @Transient
    private Random rand = new Random();

    public Monster() {

    }

    public Monster(String name, int healtPoints, int strength, int magicDefense, int physicalDefense, int agility, String description, String attack1, int accuracy1, int damage1, String attack2, int accuracy2, int damage2) {
        super(name, healtPoints, strength, magicDefense, physicalDefense, agility, 0, 0);
        this.description = description;
        this.attack1 = attack1;
        this.accuracy1 = accuracy1;
        this.damage1 = damage1;
        this.attack2 = attack2;
        this.accuracy2 = accuracy2;
        this.damage2 = damage2;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttack1() {
        return this.attack1;
    }
    public int getAccuracy1() {
        return this.accuracy1;
    }
    public void setAccuracy1(int accuracy1) {
        this.accuracy1 = accuracy1;
    }
    public int getDamage1() {
        return this.damage1;
    }

    public String getAttack2() {
        return this.attack2;
    }
    public int getAccuracy2() {
        return this.accuracy2;
    }
    public int getDamage2() {
        return this.damage2;
    }

    public int selectAttack(){
        int attack = random.nextInt(1);
        return attack;
    }


    public int performAttack(int attack){
        int hitRoll = random.nextInt(100) + 1;
        int attackAccuracy;
        if (attack == 1 ){
             attackAccuracy = this.accuracy1;         
        }
        else{
             attackAccuracy = this.accuracy2;
 
        }
         if (hitRoll > attackAccuracy) {
            return attackAccuracy;
         }
         else {return 0;}
     }

     public int dmgAttack(int value){
        int dmgAttack = 0;
        if (value == 1 ){
            dmgAttack = this.damage1;
            return dmgAttack;}

        else{
            dmgAttack = this.damage2;
            return dmgAttack;}
        
     }


}


