package com.dvn.dao.hibernate;

import com.dvn.config.HibernateConfig;
import com.dvn.dao.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOHibernate<T> implements DAO<T>{

    @Override
    public T get(Class<T> type, Long id){
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            T o = (T) session.get(type, id);
            t.commit();
            return o;
        } catch (RuntimeException e) {
            t.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public T save(T obj){
        Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        try {
            if (obj != null) {
                session.persist(obj);
                t.commit();
                return obj;
            } else {
                throw new NullPointerException("Objeto não pode ser nulo!");
            }
        } catch (RuntimeException e) {
            t.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
}