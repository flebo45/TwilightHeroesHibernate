package org.TechnicalService;

import com.sun.jna.platform.win32.Netapi32Util;
import org.Model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateService {
    private static HibernateService instance;
    private SessionFactory sessionFactory;

    private HibernateService() {
        this.sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Armor.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Trap.class)
                .addAnnotatedClass(Personage.class)
                .addAnnotatedClass(Monster.class)
                .addAnnotatedClass(Player.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Weapon.class)
                .addAnnotatedClass(Consumables.class)
                .addAnnotatedClass(ConsumableTime.class)
                .addAnnotatedClass(ConsumableStatus.class)
                .addAnnotatedClass(ConsumableSpecial.class)
                .buildSessionFactory();
    }

    public static HibernateService getInstance() {
        if (instance == null) {
            instance = new HibernateService();
        }
        return instance;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
