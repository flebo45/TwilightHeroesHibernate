package org.Model;

import java.nio.file.WatchEvent;
import java.util.*;

public class MazePopulator {
    private List<Monster> monstersList;
    private List<Trap> trapsList;
    private List<Consumables> consumablesList;
    private List<Armor> armorsList;
    private List<Weapon> weaponsList;
    private Random random = new Random();

    public MazePopulator(List<Monster> monstersList, List<Trap> trapsList, List<Consumables> consumablesList, List<Armor> armorsList, List<Weapon> weaponsList) {
        this.monstersList = monstersList;
        this.trapsList = trapsList;
        this.consumablesList = consumablesList;
        this.armorsList = armorsList;
        this.weaponsList = weaponsList;
    }

    public void populate(Maze maze) {
        this.populateWithConsumables(maze);
        this.populateWithWeapons(maze);
        this.populateWithArmors(maze);
        this.populateWithMonsters(maze);
        this.populateWithTraps(maze);
    }

    private void populateWithConsumables(Maze maze) {
        //max number of room to populate (30%)
        int maxItems = (int) ((maze.getSize() ^ 2) * 0.5);

        for (int i = 0; i < maxItems; i++) {
            //Random consumables from the list
            Consumables consumable = this.consumablesList.get(random.nextInt(consumablesList.size()));

            boolean placed = false;
            while (!placed) {
                //Select random room
                int x = random.nextInt(maze.getSize());
                int y = random.nextInt(maze.getSize());

                Room room = maze.getRoom(x, y);
                if (room != null && room.getConsumables() == null) {
                    room.setConsumables(consumable);
                    placed = true;
                }
            }

        }
    }

    private void populateWithWeapons(Maze maze) {
        Collections.shuffle(this.weaponsList);

        List<int[]> availableRooms = new ArrayList<>();

        for (int i = 0; i < maze.getSize(); i++) {
            for (int j = 0; j < maze.getSize(); j++) {
                availableRooms.add(new int[]{i, j});
            }
        }

        Collections.shuffle(availableRooms);

        int weaponIndex = 0;
        for (int[] roomCoords : availableRooms) {
            if (weaponIndex >= this.weaponsList.size()) break;

            int x = roomCoords[0];
            int y = roomCoords[1];

            Room room = maze.getRoom(x, y);
            if(room != null && room.getConsumables() == null) {
                room.setWeapon(this.weaponsList.get(weaponIndex));
                weaponIndex++;
            }
        }
    }

    private void populateWithArmors(Maze maze) {
        Collections.shuffle(this.armorsList);

        List<int[]> availableRooms = new ArrayList<>();

        for (int i = 0; i < maze.getSize(); i++) {
            for (int j = 0; j < maze.getSize(); j++) {
                availableRooms.add(new int[]{i, j});
            }
        }
        Collections.shuffle(availableRooms);

        int armorIndex = 0;
        for (int[] roomCoords : availableRooms) {
            if (armorIndex >= this.armorsList.size()) break;

            int x = roomCoords[0];
            int y = roomCoords[1];

            Room room = maze.getRoom(x, y);
            if(room != null && room.getWeapon() == null) {
                room.setArmor(this.armorsList.get(armorIndex));
                armorIndex++;
            }
        }
    }

    private void populateWithMonsters(Maze maze) {
        Collections.shuffle(this.monstersList);

        List<int[]> availableRooms = new ArrayList<>();

        for (int i = 0; i < maze.getSize(); i++) {
            for (int j = 0; j < maze.getSize(); j++) {
                availableRooms.add(new int[]{i, j});
            }
        }

        Collections.shuffle(availableRooms);

        int monsterIndex = 0;

        for (int[] roomCoords : availableRooms) {
            if (monsterIndex >= this.monstersList.size()) break;

            int x = roomCoords[0];
            int y = roomCoords[1];

            Room room = maze.getRoom(x, y);
            if(room != null && room.getMonster() == null) {
                room.setMonster(this.monstersList.get(monsterIndex));
                monsterIndex++;
            }

        }
    }

    private void populateWithTraps(Maze maze) {
        Collections.shuffle(this.trapsList);

        List<int[]> availableRooms = new ArrayList<>();
        for (int i = 0; i < maze.getSize(); i++) {
            for (int j = 0; j < maze.getSize(); j++) {
                availableRooms.add(new int[]{i, j});
            }
        }

        Collections.shuffle(availableRooms);

        int trapIndex = 0;
        for (int[] roomCoords : availableRooms) {
            if (trapIndex >= this.trapsList.size()) break;

            int x = roomCoords[0];
            int y = roomCoords[1];

            Room room = maze.getRoom(x, y);
            if(room != null && room.getTrap() == null) {
                room.setTrap(this.trapsList.get(trapIndex));
                trapIndex++;
            }
        }
    }

}
