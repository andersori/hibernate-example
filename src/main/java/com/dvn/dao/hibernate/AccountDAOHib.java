package com.dvn.dao.hibernate;

import com.dvn.entity.Account;
import com.dvn.dao.AccountDAO;
import com.dvn.dao.DAO;

public class AccountDAOHib implements AccountDAO{

    private DAO<Account> dao;

    public AccountDAOHib(){
        dao = new DAOHibernate<Account>();
    }

    @Override
    public Account getAccount(Long id){
        return dao.get(Account.class, id);
    }
    
    @Override
    public Account setAccount(Account ac){
        return dao.save(ac);
    }
}