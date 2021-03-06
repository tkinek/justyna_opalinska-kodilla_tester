package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void ShouldCalculateBillansFromAllCashMashines() {
        Bank bank = new Bank();
        bank.addCashMachine(2);

        System.out.println(bank.bilansFromAllCM());
        assertEquals(0, bank.bilansFromAllCM());
    }

    @Test
    public void ShouldCalculateAllNumberOfPayinTransactions() {
        Bank bank = new Bank();
        bank.addCashMachine(1);

        System.out.println(bank.numberOfPayin());
        assertEquals(0, bank.numberOfPayin());
    }

    @Test
    public void ShouldCalculateAllNumberOfPayoutTransactions() {
        Bank bank = new Bank();
        bank.addCashMachine(3);
        bank.numberOfPayout();
        System.out.println(bank.numberOfPayout());
        assertEquals(0, bank.numberOfPayout());
    }

    @Test
    public void ShouldCalculateAverageOfPayinTransactions() {
        Bank bank = new Bank();
        bank.addCashMachine(2);
        bank.getCashMashines()[0].addTransaction(100);

        System.out.println(bank.getPayinAverage());
        assertEquals(100, bank.getPayinAverage());
    }

    @Test
    public void ShouldCalculateAverageOfPayoutTransactions() {
        Bank bank = new Bank();
        bank.addCashMachine(1);
        bank.getCashMashines()[0].addTransaction(-100);

        System.out.println(bank.getPayoutAverage());
        assertEquals(-100, bank.getPayoutAverage());
    }
}
