package org.Model;

import java.util.Random;

public class TeleportEffectStrategy implements EffectStrategy {
    private final Random random = new Random();

    @Override
    public void apply(Consumables consumable, Player player, Maze maze) {
        while (true) {
            int randX = random.nextInt(maze.getSize());
            int randY = random.nextInt(maze.getSize());
            Room room = maze.getRoom(randX, randY);
            if (room != null) {
                player.setPosition(room);
                break;
            }
        }
    }
}
