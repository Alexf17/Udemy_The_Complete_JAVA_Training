package org.example.Bank;

class CheckingAccount extends Account {

    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -500) {
            System.out.println("Overdraft limit reached");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void display() {
        System.out.println("Checking account details:");
        System.out.println("Name: " + getName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}