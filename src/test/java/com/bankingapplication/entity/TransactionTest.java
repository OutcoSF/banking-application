package com.bankingapplication.entity;

import java.time.LocalDateTime;
import java.util.Random;

import org.joda.money.CurrencyMismatchException;
import org.joda.money.Money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    private static final Random RANDOM = new Random();

    @Test
    void testConstructorRejectsNullMoney() {
        LocalDateTime date = LocalDateTime.now();
        String message = "Constructor should reject null money";
        Throwable t = assertThrows(NullPointerException.class, () -> {
            Transaction instance = new TransactionImpl(null, date);
            System.out.println(message + ", not created instance "
                    + instance.getClass().getName() + '@'
                    + Integer.toHexString(System.identityHashCode(instance)));
        }, message);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isBlank() : "Exception message should not be blank";
        System.out.println("\"" + excMsg + "\"");
    }

    @Test
    void testConstructorRejectsNullDate() {
        int dollars = RANDOM.nextInt(1000);
        int cents = RANDOM.nextInt(90) + 10;
        Money amount = Money.parse("USD " + dollars + '.' + cents);
        String message = "Constructor should reject null date";
        Throwable t = assertThrows(NullPointerException.class, () -> {
            Transaction instance = new TransactionImpl(amount, null);
            System.out.println(message + ", not created instance "
                    + instance.getClass().getName() + '@'
                    + Integer.toHexString(System.identityHashCode(instance)));
        }, message);
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        assert !excMsg.isBlank() : "Exception message should not be blank";
        System.out.println("\"" + excMsg + "\"");
    }

    private static class TransactionImpl extends Transaction {

        TransactionImpl(Money amount, LocalDateTime date) {
            super(amount, date);
        }

    }

}