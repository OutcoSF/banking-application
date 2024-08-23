package com.bankingapplication.entity;

import java.time.LocalDateTime;

import org.joda.money.CurrencyMismatchException;
import org.joda.money.Money;

public abstract class Transaction {

    public Transaction(Money amount, LocalDateTime date) {
        if (amount == null) {
            String excMsg = "Money amount should not be null";
            throw new NullPointerException(excMsg);
        }
    }

}
