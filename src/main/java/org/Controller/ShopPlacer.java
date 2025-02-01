package org.Controller;

import org.Model.*;

import java.util.List;
import java.util.Random;

public class ShopPlacer {
    private List<Consumables> consumables;
    private List<Armor> armors;
    private List<Weapon> weapons;
    private Random random = new Random();

    public ShopPlacer(List<Consumables> consumables, List<Armor> armors, List<Weapon> weapons) {
        this.consumables = consumables;
        this.armors = armors;
        this.weapons = weapons;
    }

    public void placeShop(Room[][] maze) {
        int size = maze.length;

        // Trova il centro della mappa
        int centerX = size / 2;
        int centerY = size / 2;

        // Definiamo i limiti della zona 5x5
        int minX = Math.max(centerX - 2, 0);
        int maxX = Math.min(centerX + 2, size - 1);
        int minY = Math.max(centerY - 2, 0);
        int maxY = Math.min(centerY + 2, size - 1);

        // Generiamo una posizione casuale all'interno di questi limiti
        int shopX = random.nextInt((maxX - minX) + 1) + minX;
        int shopY = random.nextInt((maxY - minY) + 1) + minY;

        // Impostiamo il negozio
        Shop shop = new Shop(consumables, armors, weapons);
        shopX =1; 
        shopY =2;
        maze[shopX][shopY] = shop;
        shop.setPositionX(shopX);
        shop.setPositionY(shopY);
        System.out.println("SHOP in posizione:"+ shopX +" : "+ shopY);
        }
    }