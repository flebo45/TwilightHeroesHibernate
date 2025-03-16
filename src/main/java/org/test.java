package org;

import org.Controller.*;
import org.Model.*;
import org.Model.Character;
import org.TechnicalService.HibernateService;
import org.TechnicalService.PersistentManager;
import org.View.MazeView;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        //MazeFacade.mazeCreation(15, 3);


        Character character = PersistentManager.getInstance().loadCharacter("Guerriero");
        System.out.println(character.getArmor());
        /**
         * MazeCreator creator = new MazeCreator(15);
         *
         *
         *         MazeView view = new MazeView();
         *         Maze maze = creator.generateMaze();
         *         view.printTest(maze);
         *
         *         view.print(maze);
         */



        /**
         * for (int i = 0; i < 15; i++) {
         *             for (int j = 0; j < 15; j++) {
         *                 System.out.print(maze.getRoom(i, j));
         *             }
         *         }
         */



        /**
         * Character character = PersistentManager.getInstance().loadCharacter("Guerriero");
         *         System.out.println(character.getName());
         *         System.out.println(character.getWeapon().getName());
         *         System.out.println(character.getArmor());
         */

        /**
         * List<Monster> monsters = PersistentManager.getInstance().loadMonsters();
         *         System.out.println(monsters.size());
         */





        /**
         * SessionFactory sf = HibernateService.getInstance().getSessionFactory();
         *
         *         Session session = sf.openSession();
         *
         *         session.beginTransaction();
         *
         *         //Guerriero
         *
         *         Weapon guerrWeap = new Weapon("Tirapugni arrugginito", "ideale per iniziare" , "Fendente ", "Affondo", 15, 20, 90, 75);
         *         Character guerriero = new Character("Monaco", 120, 7, 7, 8, 8, 100, 6, guerrWeap);
         *
         *         Armor helm = new Armor ("Elmo Sbiadito", "Un elmo di metallo leggero, ormai arrugginito e poco efficace.", "setbase", "elmo", 1, "difesa_fisica");
         *         Armor chestplate = new Armor("Tunica Consumata", "Una tunica che ha visto giorni migliori, ormai sbiadita e con pochi segni di protezione.", "setbase", "corazza", 1, "difesa_fisica");
         *         Armor gauntlet = new Armor("Guanti Scuri", "Guanti di stoffa rovinata, non offrono protezione ma consentono una certa libertà nei combattimenti.", "setbase", "guanti", 1, "agilita");
         *         Armor leggins = new Armor("Gambali Consumati", "Gambali in tela che si sono deteriorati con il tempo, non adatti a difese ma comodi per il movimento.", "setbase", "gambali", 1, "agilita");
         *
         *         guerriero.setWeapon(guerrWeap);
         *
         *         guerriero.getArmor().put(helm.getPart(), helm);
         *         guerriero.getArmor().put(chestplate.getPart(), chestplate);
         *         guerriero.getArmor().put(gauntlet.getPart(), gauntlet);
         *         guerriero.getArmor().put(leggins.getPart(), leggins);
         *
         *         session.persist(guerrWeap);
         *         session.persist(helm);
         *         session.persist(chestplate);
         *         session.persist(gauntlet);
         *         session.persist(leggins);
         *         session.persist(guerriero);
         *
         *         session.getTransaction().commit();
         */




    }
}