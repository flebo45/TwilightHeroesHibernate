package org;

import org.TechnicalService.HibernateService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = HibernateService.getInstance().getSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();
        session.persist("");
        session.getTransaction().commit();

    }
}
