package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Monster;



public class MonsterFactory {
           // Metodo per caricare i consumabili da un file

           public static List<Monster> loadMonster(String filePath) throws IOException {
            List<Monster> monsters = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                List<String> block = new ArrayList<>();
        
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
        
                    if (line.isEmpty()) {
                        // Se il blocco è completo, processalo
                        if (!block.isEmpty()) {
                            Monster monster = parseMonster(block);
                            if (monster != null) {
                                monsters.add(monster);
                            }
                            block.clear(); // Resetta il blocco per il prossimo consumabile
                        }
                    } else {
                        // Aggiungi la riga al blocco corrente
                        block.add(line);
                    }
                }
        
                // Gestisci l'ultimo blocco se presente
                if (!block.isEmpty()) {
                    Monster monster = parseMonster(block);
                    if (monster != null) {
                        monsters.add(monster);
                    }
                }
            }
            return monsters;
        }
        private static Monster parseMonster(List<String> block) {
            if (block.size() < 3) {
                System.out.println("Blocco incompleto o errato: " + block);
                return null;
            }
            String name = block.get(0);
            String description = block.get(1);
            int health = Integer.parseInt(block.get(2).trim());
            int agl = Integer.parseInt(block.get(3).trim());
            int magicD = Integer.parseInt(block.get(4).trim());
            int physicD = Integer.parseInt(block.get(5).trim());
            int str = Integer.parseInt(block.get(6).trim());
            String attack1 = block.get(7);
            String attack2 = block.get(8);
            int dmg1 = Integer.parseInt(block.get(9).trim());
            int dmg2 = Integer.parseInt(block.get(10).trim());
            int accuracy1 = Integer.parseInt(block.get(11).trim());
            int accuracy2 = Integer.parseInt(block.get(12).trim());
            return new Monster(name, description, health,str, agl, magicD, physicD, attack1, attack2, dmg1, dmg2, accuracy1, accuracy2 );
        }
}
