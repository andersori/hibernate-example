package com.dvn.dao;

import com.dvn.entity.Account;

public interface AccountDAO{

    public Account getAccount(Long id);

    public Account setAccount(Account ac);

}