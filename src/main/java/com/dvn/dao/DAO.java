package com.dvn.dao;

//import java.util.List;

public interface DAO<T>{

    public T get(Class<T> obj, Long id);

    public T save(T obj);

    //public T update(T obj);

    //public void remove(T obj);

    //public List<T> getAll(Class<T> type);

    //public Long count(Class<T> type);

}