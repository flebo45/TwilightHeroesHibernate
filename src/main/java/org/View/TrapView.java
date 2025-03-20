package org.View;

import org.Model.Player;
import org.Model.Trap;

public class TrapView {

    public void trapTrigger(Trap trap){
        System.out.println("hai trovato nel tuo percorso: " + trap.getName() + "!");
        System.out.println(trap.getDescription());
        System.out.println(trap.getDescription2());
    }


    public void playerRoll(int roll, int playerStat, String stat){
    System.out.println("Hai tirato su "+stat +": " + roll + " + " + playerStat );
    }

    public void succes(String succes){
        System.out.println(succes);
    }

    public void failure(String fail, int dmg, Player pg){
        System.out.println(fail);
        System.out.println("Hai subito : "+ dmg+ " danni");
        System.out.println(pg.getHealtPoints()+ "/" + pg.getCurrentHealtPoints());
    }
}
