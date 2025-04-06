package org.Controller;

import org.Model.Player;
import org.Model.Room;
import org.Model.Shop;
import org.View.GameView;
import org.View.ShopView;

import java.util.Dictionary;
import java.util.Map;

public class ShopFacade {
    private  final GameView gameView;
    private final ShopView shopView;

    public ShopFacade() {
        this.gameView = new GameView();
        this.shopView = new ShopView();
    }

    public boolean buyArmor(Player player, Shop shop, int choice) {
        if (player.getMoney() >= choice * 5) {
            if(shop.getArmorList().containsKey(choice * 5)) {
                player.decreaseMoney(choice * 5);
                player.getInventory().addItem(shop.getArmorList().get(choice * 5));
                shop.removeArmor(choice * 5);
                this.shopView.showSuccessTransaction();
                return true;
            } else {
                this.shopView.showItemError();
                return false;
            }
        }else{
            this.shopView.showMoneyError();
            return false;
        }
    }

    public boolean buyWeapon(Player player, Shop shop, int choice) {
        if (player.getMoney() >= choice * 5) {
            if(shop.getWeaponList().containsKey(choice * 5)) {
                player.decreaseMoney(choice * 5);
                player.getInventory().addItem(shop.getWeaponList().get(choice * 5));
                shop.removeWeapon(choice * 5);
                this.shopView.showSuccessTransaction();
                return true;
            } else {
                this.shopView.showItemError();
                return false;
            }
        }else{
            this.shopView.showMoneyError();
            return false;
        }
    }

    public boolean buyConsumables(Player player, Shop shop, int choice) {
        if (player.getMoney() >= choice * 5) {
            if(shop.getConsumableList().containsKey(choice * 5)) {
                player.decreaseMoney(choice * 5);
                player.getInventory().addConsumables(shop.getConsumableList().get(choice * 5));
                shop.removeConsumable(choice * 5);
                this.shopView.showSuccessTransaction();
                return true;
            } else {
                this.shopView.showItemError();
                return false;
            }
        }else{
            this.shopView.showMoneyError();
            return false;
        }
    }

    public void enterShop(Player pg, Shop shop) {
        this.shopView.enterShop(pg.getMoney());
        String choice = this.gameView.getUserInput();
        if (choice.equals("1")){
            this.shopView.printWeap(shop);
        }
        else if(choice.equals("2")){
            this.shopView.printArm(shop);
        }
        else if(choice.equals("3")){
            this.shopView.printCons(shop);
        }
        else{
        }
        }
    }
