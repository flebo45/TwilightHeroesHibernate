package org.TechnicalService;

import org.Model.Trap;
import java.util.List;

public class TrapDAO {

    public static List<Trap> findAllTraps() {
        return EntityManager.getInstance().findAll(Trap.class);
    }
}
