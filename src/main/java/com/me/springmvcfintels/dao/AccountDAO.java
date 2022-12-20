package com.me.springmvcfintels.dao;

import com.me.springmvcfintels.entity.Account;

public interface AccountDAO {
 
    
    public Account findAccount(String userName);
    
}