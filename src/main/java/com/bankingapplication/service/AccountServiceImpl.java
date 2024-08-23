package com.bankingapplication.service;

import com.bankingapplication.dao.AccountDAO;
import com.bankingapplication.entity.Account;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;

    // TODO: Write tests for this
    @Override
    public Account getAccountByID(int id) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Account addAccount(Account account) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Account deleteAccountByID(int id) {
        return null;
    }

}
