package org.Controller;

import org.Model.Player;
import org.Model.Shop;
import org.View.ShopView;

import java.util.Dictionary;
import java.util.Map;

public class ShopFacade {
    private final ShopView shopView;

    public ShopFacade() {
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
}
