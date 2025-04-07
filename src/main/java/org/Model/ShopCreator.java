package org.Model;


import java.util.List;
import java.util.Random;

public class ShopCreator {
    private List<Consumables> consumablesList;
    private List<Armor> armorList;
    private List<Weapon> weaponList;
    private Random random = new Random();

    public ShopCreator(List<Consumables> consumablesList, List<Armor> armorList, List<Weapon> weaponList) {
        this.consumablesList = consumablesList;
        this.armorList = armorList;
        this.weaponList = weaponList;
        for(int i = 0; i < consumablesList.size(); i++);{
            int j = 0;
            System.out.println(armorList.get(j));
            j++;
        }
        System.out.println(armorList.size());
        System.out.println(weaponList.size());
    }


    public void placeShop(Maze maze, int maxItem) {
        //Find the middle of the map
        int centerX = maze.getSize() / 2;
        int centerY = maze.getSize() / 2;

        //Define limit for a zone 5x5
        int minX = Math.max(centerX - 2, 0);
        int maxX = Math.min(centerX + 2, maze.getSize() - 1);
        int minY = Math.max(centerY - 2, 0);
        int maxY = Math.min(centerY + 2, maze.getSize() - 1);

        //Generate casual position in this field
        int shopX = random.nextInt(maxX - minX + 1) + minX;
        int shopY = random.nextInt(maxY - minY + 1) + minY;

        //Set the shop in the maze
        Shop shop = new Shop(this.consumablesList, this.armorList, this.weaponList, maxItem);
        shop.setPositionX(shopX);
        shop.setPositionY(shopY);
        maze.setRoom(shopX, shopY, shop);
    }

}
