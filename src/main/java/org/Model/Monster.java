package org.Model;

import jakarta.persistence.*;

import java.util.Random;
@Entity
@DiscriminatorValue("MONSTER")
public class Monster extends Personage {
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int accuracy1;

    @Column(nullable = false)
    private int accuracy2;

    @Column(nullable = false)
    private int dmg1;

    @Column(nullable = false)
    private int dmg2;

    @Column(nullable = false)
    private String attack1;

    @Column(nullable = false)
    private String attack2;

    @Transient
    private Random random = new Random();

    public Monster() {}
    
        
        public String getDescription() {
            return description;
        }
    
        public void setDEscription(String description) {
            this.description = description;
        }
    
        public Monster(String name, String description,int currentHP, int str, int agl, int defF, int defM, String attack1, String attack2, int dmg1, int dmg2, int accuracy1, int accuracy2) {
            this.name = name;
            this.description = description; 
            this.HP = currentHP;
            this.AGL = agl;
            this.magic_DEF = defM;
            this.physic_DEF = defF;
            this.STR = str;
            this.accuracy1 = accuracy1;
            this.accuracy2 = accuracy2;
            this.dmg1 = dmg1;
            this.dmg2 = dmg2;
            this.attack1 = attack1;
            this.attack2 = attack2;
        } 
    
        public int getAccuracy1() {
            return accuracy1;
        }
    
        public void setAccuracy1(int accuracy) {
            this.accuracy1 = accuracy;
        }

        public int getAccuracy2() {
            return accuracy2;
        }
    
        public void setAccuracy2(int accuracy) {
            this.accuracy2 = accuracy;
        }

        public int getdmg1() {
            return dmg1;
        }
    
        public void setdmg1(int dmg) {
            this.dmg1 = dmg;
        }

        public int getdmg2() {
            return dmg2;
        }
    
        public void setdmg2(int dmg) {
            this.dmg2 = dmg;
        }

        public String getAttack1() {
            return attack1;
        }
    
        public void setAttack1(String attack) {
            this.attack1 = attack;
        }

        public String getAttack2() {
            return attack1;
        }
    
        public void setAttack2(String attack) {
            this.attack2 = attack;
        }
    
        public String chooseAttackName() {
            return random.nextBoolean() ? attack1 : attack2;
    }

    public int chooseAttackDamage() {
        return random.nextBoolean() ? dmg1 : dmg2;
    }

    public int chooseAttackAccuracy() {
        return random.nextBoolean() ? accuracy1 : accuracy2;
    }
}
