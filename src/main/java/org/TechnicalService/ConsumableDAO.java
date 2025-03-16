package org.TechnicalService;

import org.Model.Consumables;

import java.util.List;

public class ConsumableDAO {

    public static List<Consumables> findAllConsumables() {
        return EntityManager.getInstance().findAll(Consumables.class);
    }

    public static List<Consumables> findShopConsumables(int maxItem) {
        return EntityManager.getInstance().findRandomElements(Consumables.class, maxItem);
    }
}
