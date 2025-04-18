package org.Model;

public enum GameDifficulty {
    EASY(15, 10),
    MEDIUM(25, 5),
    HARD(35, 3);

    private final int mazeSize;
    private final int maxShopItems;

    GameDifficulty(int mazeSize, int maxShopItems) {
        this.mazeSize = mazeSize;
        this.maxShopItems = maxShopItems;
    }

    public int getMazeSize() {
        return this.mazeSize;
    }

    public int getMaxShopItems() {
        return this.maxShopItems;
    }
}
