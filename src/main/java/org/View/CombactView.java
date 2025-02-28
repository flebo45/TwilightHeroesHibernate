package org.View;

import java.util.Scanner;

import org.Model.Monster;

public class CombactView {
    private Scanner scanner = new Scanner(System.in);

    public static void MonsterEnc(Monster monster){
        System.out.println("C'è un mostro qui: " + monster.getName() + "!");
        
    }

    public static void TrapEnc(){
        System.out.println("La trappola è rimasta attiva, \nper effettuare qualsiasi azione devi prima superare la prova, altrimenti si riattiverà");
    }
}
