package org;

import org.Controller.MonsterFactory;
import org.Model.Monster;
import org.TechnicalService.HibernateService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.List;

public class DbPopulator {
    public static void main(String[] args) throws IOException {
        /**
        SessionFactory sf = HibernateService.getInstance().getSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();
        session.persist("");
        session.getTransaction().commit();
        **/
        /**
        List<Monster> monsters = MonsterFactory.loadMonster("src/main/java/org/monster.txt");
        for(Monster monster : monsters){
            System.out.println(monster);
        }
         **/
    }
}
