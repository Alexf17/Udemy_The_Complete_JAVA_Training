package org.example.Bank;

class SavingsAccount extends Account {

    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void display() {
        System.out.println("Savings account details:");
        System.out.println("Name: " + getName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }
}
