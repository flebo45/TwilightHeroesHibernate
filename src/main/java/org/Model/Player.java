package org.Model;


import java.util.Random;

public class Player extends Personage {
    private String username;
    private int currentMana;
    private int money;
    private Inventory inventory;
    private Armor armor;
    private Weapon weapon;
    Random random = new Random();

    public Player(String username, Character character) {
        super(character.getName(), character.getHealthPoints(), character.getStrength(), character.getMagicDefense(), character.getPhysicalDefense(), character.getAgility(), character.getMana(), character.getLuck());
        this.username = username;
        this.currentMana = character.getMana();
        this.money = 100;
        this.inventory = new Inventory();
        this.armor = character.getArmor().get("corazza");
        this.inventory.addItem(this.armor);
        this.armor.setEquipped(true);
        this.weapon = character.getWeapon();
        this.inventory.addItem(this.weapon);
        this.weapon.setEquipped(true);
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getMoney() {
        return this.money;
    }
    public void decreaseMoney(int amount) {
        this.money -= amount;
    }
    public Inventory getInventory() {
        return this.inventory;
    }
    public int getCurrentMana() {
        return this.currentMana;
    }
    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Armor getArmor() {
        return this.armor;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public boolean move(Direction direction, Maze maze) {
        Room nextRoom = maze.getAdjacentRoom(this.position, direction);
        if(nextRoom != null) {
            this.setPosition(nextRoom);
            return true;
        }
        return false;
    }


    private int getBaseStatistic(String attribute){
        return switch (attribute) {
            case "forza" -> this.strength;
            case "difesa_fisica" -> this.physicalDefense;
            case "difesa_magica" -> this.magicDefense;
            case "agilita" -> this.agility;
            default -> 0;
        };
    }

    public int getFinalAttribute(String attribute) {
        int baseAttribute = this.getBaseStatistic(attribute);
        return baseAttribute + this.armor.getBonus(attribute);

    }
    public int performAttack(String attack) {
        int hitRoll = random.nextInt(100) + 1;
        int attackAccuracy;
        
        if (attack.equals(this.getWeapon().getAttackP())) {
            attackAccuracy = this.getWeapon().getPrimaryAccuracy();
        } else {
            attackAccuracy = this.getWeapon().getSecondaryAccuracy();
        }
        
        return hitRoll <= attackAccuracy ? attackAccuracy : 0;
    }


    public int getRandomMoney(){
        return random.nextInt(100);
    }


    public int roll(){
        int roll = random.nextInt(20);
        return roll;
        
    }

    public int getPlayerStat(String trap) {
        switch (trap.toLowerCase()) {
            case "agl": return this.getAgility();
            case "str": return this.getStrength();
            case "magic_d": return this.getMagicDefense();
            case "luck" : return this.getLuck();
            default: return 0; // Se la statistica non è riconosciuta, assume 0
        }
    }

    public void addMoney(int newMoney) {
        this.money = money+newMoney;
    }

    public void equipItem(Item item) {
        if (item instanceof Armor) {
            if (this.armor != null) {
                this.armor.setEquipped(false);
            }
            this.armor = (Armor) item;
            this.armor.setEquipped(true);
        } else if (item instanceof Weapon) {
            if (this.weapon != null) {
                this.weapon.setEquipped(false);
            }
            this.weapon = (Weapon) item;
            this.weapon.setEquipped(true);
        }
        
    }

}



/**
 * import jakarta.persistence.*;
 *
 * import java.util.HashMap;
 * import java.util.Map;
 *
 * @Entity
 * @DiscriminatorValue("PLAYER")
 * public class Player extends Personage {
 *     @Column(nullable = false)
 *     private int mana;
 *
 *     @Column(nullable = false)
 *     private int luck;
 *
 *     @Transient
 *     private int Money;
 *
 *     @Transient
 *     private Weapon weapon;
 *
 *     @Transient
 *     private Inventory inventory;
 *
 *     @Transient
 *     private int currentMN;
 *
 *     @Transient
 *     private Map<String, Armor> equippedArmor;
 *
 *
 *     public Player() {
 *         this.equippedArmor = new HashMap<>();
 *         th
 *     }
 *
 *    public void setEquipArmor(){
 *     this.equippedArmor = new HashMap<>();
 *    }
 *
 *    public Map<String, Armor> getEquipArm(){
 *     return equippedArmor;
 *    }
 *
 *    public void setFirstInventory(){
 *     this.inventory = new Inventory();
 *    }
 *
 *
 *     public int getMana() {
 *         return mana;
 *     }
 *
 *     public void setMana(int mana) {
 *         this.mana = mana;
 *     }
 *
 *     public int getLuck() {
 *         return luck;
 *     }
 *
 *     public void setLuck(int luck) {
 *         this.luck = luck;
 *     }
 *
 *
 *     public int getMoney() {
 *         return Money;
 *     }
 *
 *     public void setMoney(int Money) {
 *         this.Money = Money;
 *     }
 *
 *     public Inventory getInventory() {
 *         return inventory;
 *     }
 *
 *     public void setInventory(Inventory inventory) {
 *         this.inventory = inventory;
 *     }
 *
 *     public int getCurrentMN() {
 *         return currentMN;
 *     }
 *
 *     public void setCurrentMN(int currentMN) {
 *         this.currentMN = currentMN;
 *     }
 *
 *     public Weapon getWeapon() {
 *         return weapon;
 *     }
 *
 *     public void setWeapon(Weapon weapon) {
 *         this.weapon = weapon;
 *     }
 *
 * }
 */


   



    





