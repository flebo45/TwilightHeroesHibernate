package org.Controller;

import org.Model.*;
import org.TechnicalService.ConsumableDAO;
import org.TechnicalService.PersistentManager;
import org.View.MazeView;
import org.View.RoomView;

import java.util.List;

public class MazeFacade {
    private final MazeView mazeView;
    private final RoomView roomView;

    public MazeFacade() {
        this.mazeView = new MazeView();
        this.roomView = new RoomView();
    }

    public Maze mazeCreation(int mazeSize, int maxShopItem, Player player) {


        //GENERATION
        MazeCreator mazeCreator = new MazeCreator(mazeSize);
        Maze maze = mazeCreator.generateMaze();


        //POPULATION
        List<Monster> monsterList = PersistentManager.getInstance().loadMonsters();
        List<Trap> trapList = PersistentManager.getInstance().laodTraps();
        List<Consumables> consumablesList = PersistentManager.getInstance().loadConsumables();
        List<Armor> armorList = PersistentManager.getInstance().loadArmors();
        List<Weapon> weaponList = PersistentManager.getInstance().loadWeapons();

        MazePopulator mazePopulator = new MazePopulator(monsterList, trapList, consumablesList, armorList, weaponList);
        mazePopulator.populate(maze);

        //SHOP
        List<List<?>> shopItemsList = PersistentManager.getInstance().loadShopItems(maxShopItem);
        List<Consumables> shopConsumablesList = (List<Consumables>) shopItemsList.get(0);
        List<Armor> shopArmorsList = (List<Armor>) shopItemsList.get(1);
        List<Weapon> shopWeaponsList = (List<Weapon>) shopItemsList.get(2);

        ShopCreator  shopCreator = new ShopCreator(shopConsumablesList, shopArmorsList, shopWeaponsList);
        shopCreator.placeShop(maze, maxShopItem);

        //Player
        player.setPosition(maze.getRoom(1, 1));

        this.mazeView.mazeAlert();
        this.mazeView.printMaze(maze, player);
        return maze;

    }

    public void room(Room room) {
        this.roomView.displayRoom(room);
        //gestire logica room
    }

    public void wall() {
        this.roomView.displayWall();
    }


}
