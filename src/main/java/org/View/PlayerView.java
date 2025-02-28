package org.View;


import org.Model.Room;

public class PlayerView {

    public static void examineRoom() {
        System.out.println("Esamini la stanza...");
    }

    public static void ExamineReuslt(int a, Room currentRoom){
        if(a == 1){System.out.println(" Hai trovato un consumabile: " + currentRoom.getConsumables().toString());}
    
        if(a == 2){ System.out.println("Hai trovato un'arma: " + currentRoom.getWeapon().toString());}

        if(a == 3){ System.out.println("Hai trovato un'armatura: " + currentRoom.getArmor().toString());}

        else{System.out.println("Non c'è niente nella stanza.");}
        
    }

}
