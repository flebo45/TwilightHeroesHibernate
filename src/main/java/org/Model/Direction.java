package org.Model;

import java.util.Map;

public enum Direction {
    UP(-1, 0),
    DOWN(1, 0),
    LEFT(0, -1),
    RIGHT(0,1);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return this.dx;
    }

    public int getDy() {
        return this.dy;
    }

    private static final Map<String, Direction> inputMap = Map.of(
            "w", UP,
            "s", DOWN,
            "a", LEFT,
            "d", RIGHT
    );

    public static Direction fromInput(String input) {
        return inputMap.getOrDefault(input.toLowerCase(), null);
    }


}
