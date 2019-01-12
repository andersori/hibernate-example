package com.dvn;

import com.dvn.dao.AccountDAO;
import com.dvn.dao.hibernate.AccountDAOHib;
import com.dvn.entity.Account;

public class AppTest {

    public static void main(String[] args){

        AccountDAO dao = new AccountDAOHib();

        Account ac = new Account();
        ac.setName("Anderson");
        ac.setPassword("senhasenha");

        ac = dao.setAccount(ac);

        System.out.println(ac.getName());
        System.out.println(dao.getAccount(1L).getName());
    }
}
