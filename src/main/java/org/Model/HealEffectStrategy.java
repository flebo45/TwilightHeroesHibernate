package org.Model;

public class HealEffectStrategy implements EffectStrategy {
    @Override
    public void apply(Consumables consumable, Player player, Maze maze) {
        if (consumable instanceof ConsumableStatus status) {
            player.heal(status.getHeal());
            player.addMana(status.getMana());
        }
    }
}
