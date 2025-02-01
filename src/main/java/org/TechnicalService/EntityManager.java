package org.TechnicalService;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class EntityManager {
    private static EntityManager instance;
    private final SessionFactory sessionFactory;

    /**
     * Private constructor for implement the singleton
     */
    private EntityManager() {
        this.sessionFactory = HibernateService.getInstance().getSessionFactory();
    }

    /**
     * Public method to take the instance of the EntityManager class
     * @return      the instance of the class (Singleton Pattern)
     */
    public static EntityManager getInstance() {
        if (instance == null) {
            instance = new EntityManager();
        }
        return instance;
    }


    /**
     * Method to save a new object in the db
     * @param entity
     * @param <T>
     */
    public <T> void save(T entity) {
        Transaction tx = null;
        try(Session session = sessionFactory.openSession()) {
            tx = session.beginTransaction();
            session.persist(entity);
            tx.commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to update an existing object in the db
     * @param entity
     * @param <T>
     */
    public <T> void update(T entity) {
        Transaction tx = null;
        try (Session session = sessionFactory.openSession()) {
            tx = session.beginTransaction();
            session.merge(entity);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    /**
     * Method that returns an object, found by the id and the class type
     * @param entityType
     * @param id
     * @return              the specified object from the id
     * @param <T>
     */
    public <T> T findById(Class<T> entityType, int id) {
        T result = null;
        try (Session session = sessionFactory.openSession()) {
            result = session.get(entityType, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Method that returns all the objects from a table in the db, so all the objects from a certain class
     * @param entityType
     * @return              all the objects from a table
     * @param <T>
     */
    public <T> List<T> findAll(Class<T> entityType) {
        List<T> result = null;
        try (Session session = sessionFactory.openSession()) {
            result = session.createQuery("FROM " + entityType.getSimpleName(), entityType).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
