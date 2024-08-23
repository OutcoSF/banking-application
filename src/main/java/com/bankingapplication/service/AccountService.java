package com.bankingapplication.service;

import com.bankingapplication.dao.AccountDAO;
import com.bankingapplication.entity.Account;

import java.util.List;

public interface AccountService {

    Account getAccountByID(int id);

    Account addAccount(Account account);

    Account updateAccount(Account account);

    Account deleteAccountByID(int id);

}
