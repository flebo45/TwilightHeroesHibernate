package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Model.Trap;


public class TrapFactory {
    // Metodo per caricare le armi da un file
    public static List<Trap> loadTraps(String filePath) throws IOException {
        List<Trap> traps = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            List<String> block = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    // Se il blocco è completo, processalo
                    if (!block.isEmpty()) {
                        Trap trap = parseTrap(block);
                        if (trap != null) {
                            traps.add(trap);
                        }
                        block.clear(); // Resetta il blocco per il prossimo oggetto
                    }
                } else {
                    // Aggiungi la riga al blocco corrente
                    block.add(line);
                }
            }

            // Gestisci l'ultimo blocco se presente
            if (!block.isEmpty()) {
                Trap trap = parseTrap(block);
                if (trap != null) {
                    traps.add(trap);
                }
            }
        }
        return traps;
    }

    // Metodo per interpretare un blocco di testo come un'arma
    private static Trap parseTrap(List<String> block) {
        try {
            if (block.size() < 7) {
                System.out.println("Blocco incompleto o errato: " + block);
                return null;
            }

            String name = block.get(0);
            String description = block.get(1);
            String descrp2 = block.get(2);
            String stat = block.get(3); 
            int roll = Integer.parseInt(block.get(4));
            int dmg = Integer.parseInt(block.get(5));
            String success = block.get(6);
            String failure = block.get(7);
            return new Trap(name, description, dmg, stat, roll, descrp2, success, failure);
        } catch (NumberFormatException e) {
            System.out.println("Errore nel parsing del danno per il blocco: " + block);
            return null;
        }
    }

}
