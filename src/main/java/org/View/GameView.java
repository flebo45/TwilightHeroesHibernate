package org.View;

import java.util.Scanner;

import org.Model.Player;

public class GameView {

    private final Scanner scanner;

    public GameView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMainMenu(){
        System.out.println("|=== TWILIGHT HEROES ===|");
        System.out.println("|1. Nuova Partita       |");
        System.out.println("|2. Carica Partita      |");
        System.out.println("|3. Esci                |");
        System.out.println("|=======================|");
        System.out.print("Seleziona un'opzione:    ");

    }

    public void showDifficultyMenu(){
        System.out.println("\n|=== Seleziona la Difficoltà ===|");
        System.out.println("|1. Facile                      |");
        System.out.println("|2. Normale                     |");
        System.out.println("|3. Difficile                   |");
        System.out.print("Inserisci il numero della difficoltà: ");
    }



    public String getUserInput(){
        return scanner.nextLine();
    }

    public int getUserInputInt(){
        return scanner.nextInt();
    }



    public void exitGame(){
        System.out.println("Grazie per aver giocato");
    }

    public void invalidOption(){
        System.out.println("Opzione non valida. Riprova!");
    }

    public void loadGame() {
        System.out.println("Funzione non ancora implementata.");
    }

    public void endGame(Player player){
         System.out.println("===========================================================================");
        System.out.println("Complimenti "+ player.getName() + " per la tua incredibile impresa.\n Hai completato il gioco di TwilightHeroes\n\n");
        System.out.println("Realizzato da Vortex studio per il progetto di software Eng.");
         System.out.println("==========================================================================");
    }

      public void pgDead(){
        System.out.println("===============================================");
        System.out.println("I tuoi hp Hanno raggiunto lo 0, ha perso!!");
        System.out.println("===============================================");
    }

}
