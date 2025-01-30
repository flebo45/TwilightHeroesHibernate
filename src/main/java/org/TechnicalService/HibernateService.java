package org.TechnicalService;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateService {
    private static HibernateService instance;
    private SessionFactory sessionFactory;

    private HibernateService() {
        this.sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Monster.class)
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
