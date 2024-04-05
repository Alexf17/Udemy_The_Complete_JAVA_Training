package org.example.Bank;

import java.util.Date;

class Transaction {
    private double amount;
    private Date date;
    private Account account;

    public Transaction(double amount, Date date, Account account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public void display() {
        System.out.println("Transaction details:");
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Account name: " + account.getName());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("New balance: " + account.getBalance());
    }
}
