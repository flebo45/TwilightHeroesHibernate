package org.TechnicalService;

import org.Model.Consumables;

import java.util.List;

public class ConsumableDAO {

    public static List<Consumables> findAllConsumables() {
        return EntityManager.getInstance().findAll(Consumables.class);
    }
}
