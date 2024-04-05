package org.example.Bank;

public class Main {
    public static void main(String[] args) {

        // Create a new banking object
        Banking banking = new Banking();

        // Create some new accounts
        SavingsAccount savingsAccount = new SavingsAccount("John Smith", "123456789", 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount("Jane Doe", "987654321", 500.0);

        // Add the accounts to the banking system
        banking.addAccount(savingsAccount);
        banking.addAccount(checkingAccount);

        // Make some transactions
        banking.processTransaction(savingsAccount, 500.0);
        banking.processTransaction(checkingAccount, 1000.0);

        // Display the account information
        savingsAccount.display();
        checkingAccount.display();

        // Remove an account
        banking.removeAccount(savingsAccount);
    }
}
