package org;

import org.Controller.ItemFactory;
import org.Controller.MazeGenerator;
import org.Controller.MonsterFactory;
import org.Controller.TrapFactory;
import org.Model.*;
import org.TechnicalService.HibernateService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DbPopulator {
    public static void main(String[] args) throws IOException {

        SessionFactory sf = HibernateService.getInstance().getSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();
        /**
        List<Monster> monsters = MonsterFactory.loadMonster("src/main/java/org/monster.txt");
        for(Monster monster : monsters){
            session.persist(monster);
        }
         **/

        //session.beginTransaction();
        /**
        List<Trap> traps = TrapFactory.loadTraps("src/main/java/org/trap.txt");
        for(Trap trap : traps) {
            session.persist(trap);
        }
         **/
        /**
        MazeGenerator mg = new MazeGenerator();
        mg.loadRoomDescriptions("src/main/java/org/room.txt");
        List<Room> rooms = mg.getRooms();
        for(Room room : rooms) {
            session.persist(room);
        }**/

        /**
        List<Weapon> weapons = ItemFactory.loadWeapons("src/main/java/org/weapon.txt");
        for(Weapon weapon: weapons) {
            session.persist(weapon);
        }
         **/

        List<Armor> armors = ItemFactory.loadArmor("src/main/java/org/armor.txt");
        for (Armor armor : armors) {
            session.persist(armor);
        }
        session.getTransaction().commit();
    }
}
