package org.Controller;

import org.Model.Player;
import org.Model.Trap;
import org.View.TrapView;

public class TrapFacade {
    private final TrapView trapView;

    public TrapFacade(){
        this.trapView = new TrapView();
    }

    public void triggerTrap(Player pg, Trap trap){
        trapView.trapTrigger(trap);
        int stat = pg.getPlayerStat(trap.getStat());
        int roll = pg.roll();
        boolean trapOutCome = trap.resolveTrap(stat,roll);
        trapView.playerRoll(stat, roll, trap.getStat());
        if (trapOutCome == true){
            trapView.succes(trap.getSuccess());
        }
        else{
            int dmg = pg.dmgCounter(trap.getDamage(), pg.getPhysicalDefense());
            pg.takeDamage(dmg);
            trapView.failure(trap.getFailure(), dmg, pg);
        }
        pg.getPosition().setTrap(null);
    }
}
