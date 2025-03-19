package org.View;

import org.Model.Monster;
import org.Model.Player;

public class CombatView {

    public CombatView(){}


    public void displayEncounter(Monster monster){
        System.out.println("Attenzione hai incontrato un nemico! ");
        System.out.println(monster.getName());
        System.out.println("Hp: " +monster.getHealtPoints());
    }

    public void baseTurn(Player player, Monster monster){
        System.out.println("\nTurno del giocatore!");
        System.out.println("Scegli l'attacco:");
        System.out.println("a. " + player.getWeapon().getAttackP() + " (Danno: " + player.getWeapon().getDmgP() + ", Accuratezza: " + player.getWeapon().getPrimaryAccuracy() + ")");
        System.out.println("b. " + player.getWeapon().getAttackS() + " (Danno: " + player.getWeapon().getDmgS() + ", Accuratezza: " + player.getWeapon().getSecondaryAccuracy() + ")");

    }

    public void agilityRoll(int pgAgl, int mnAgl){
        System.out.println("\nIniziativa: Giocatore (" + pgAgl + ") vs Mostro (" + mnAgl + ")");
    }

    public void attackMiss(String name){
        System.out.println(name + " ha mancato l'attacco.");
    }}
