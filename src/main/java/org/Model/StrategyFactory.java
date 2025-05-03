package org.Model;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final Map<String, EffectStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put("heal", new HealEffectStrategy());
        strategyMap.put("teleport", new TeleportEffectStrategy());
    }

    public static EffectStrategy getStrategyFor(Consumables consumable) {
        if (consumable instanceof ConsumableStatus) {
            return strategyMap.get("heal");
        }
        if (consumable instanceof ConsumableSpecial special) {
            return strategyMap.get("teleport");
        }
        return null;
    }
}
