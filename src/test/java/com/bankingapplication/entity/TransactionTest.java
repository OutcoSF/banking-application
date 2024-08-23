package com.bankingapplication.entity;

import java.time.LocalDateTime;

import org.joda.money.CurrencyMismatchException;
import org.joda.money.Money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testConstructorRejectsNullMoney() {
        LocalDateTime date = LocalDateTime.now();
        String message = "Constructor should reject null money";
        Throwable t = assertThrows(NullPointerException.class, () -> {}, message);
        fail("FINISH WRITING");
    }

}