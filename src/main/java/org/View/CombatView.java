package org.View;

import org.Model.Monster;
import org.Model.Player; 

public class CombatView {

    public CombatView(){}


    public void displayEncounter(Monster monster){
        System.out.println("=====================================");
        System.out.println("Attenzione hai incontrato un nemico! ");
        System.out.println(monster.getName());
        System.out.println("Hp: " +monster.getHealtPoints());
        System.out.println("=====================================");
    }

    public void baseTurn(Player player, Monster monster){
        System.out.println("\nTurno del giocatore!");
        System.out.println("Scegli l'attacco:");
        System.out.println("=====================================");
        System.out.println("1. " + player.getWeapon().getAttackP() + " (Danno: " + player.getWeapon().getDmgP() + ", Accuratezza: " + player.getWeapon().getPrimaryAccuracy() + ")");
        System.out.println("=====================================");
        System.out.println("2. " + player.getWeapon().getAttackS() + " (Danno: " + player.getWeapon().getDmgS() + ", Accuratezza: " + player.getWeapon().getSecondaryAccuracy() + ")");
        System.out.println("=====================================");
    }

    public void agilityRoll(int pgAgl, int mnAgl){
        System.out.println("=====================================");
        System.out.println("Iniziativa: Giocatore (" + pgAgl + ") vs Mostro (" + mnAgl + ")");
        System.out.println("=====================================");
    }

    public void attackMiss(String name){
        System.out.println("=====================================");
        System.out.println(name + " ha mancato l'attacco.");
        System.out.println("=====================================");
    }

    public void endRound(Player pg, Monster monster){
        System.out.println("=====================================");
        System.out.println(pg.getName() + " HP: " +pg.getHealtPoints()+ "/" +pg.getCurrentHealtPoints());
        System.out.println(monster.getName() + "HP:  " + monster.getHealtPoints() + "/" + monster.getCurrentHealtPoints());
        System.out.println("=====================================");
    }

    public void dmgDealt(int dmg, String name){
        System.out.println("=====================================");
        System.out.println( name +" Ha subito : " + dmg +" danni");
        System.out.println("=====================================");
    }

    public void win(String nome, int monete){
        System.out.println("=====================================");
        System.out.println("Hai sconfitto : " + nome + "!!");
        System.out.println("Hai ottenuto : "+ monete + " monete");
        System.out.println("=====================================");
    }
}
