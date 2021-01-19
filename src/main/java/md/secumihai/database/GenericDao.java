package md.secumihai.database;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.List;


public class GenericDao {
    private static SessionFactory factory;

    public GenericDao() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /*** SAVE DAO OBJECT ***/
    public <T> T save(final T o){
        Session session= factory.openSession();
        Transaction trans=session.beginTransaction();
        Object object = (T) session.save(o);
        trans.commit();
        return (T) object;
    }

    /*** DELETE DAO OBJECT ***/
    public void delete(final Object object){
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        session.delete(object);
        trans.commit();
    }

    /*** GET DAO OBJECT BY INT ID ***/
    public <T> T get(final Class<T> type, final int id){
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        Object object = (T) session.get(type, id);
        trans.commit();
        return (T) object;
    }

    /*** GET DAO OBJECT BY STRING ID ***/
    public <T> T get(final Class<T> type, final String id){
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        Object object = (T) session.get(type, id);
        trans.commit();
        return (T) object;
    }

    /*** GET ALL DAO OBJECTS ***/
    public <T> List<T> getAll(final Class<T> type) {
        Session session=factory.openSession();
        Transaction trans=session.beginTransaction();
        final Criteria crit = session.createCriteria(type);
        List<T> list = crit.list();
        trans.commit();
        return list;
    }
}