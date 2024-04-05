package org.example.Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Banking {
    private List<Account> accounts;

    public Banking() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void processTransaction(Account account, double amount) {
        Date date = new Date();
        Transaction transaction = new Transaction(amount, date, account);
        transaction.display();
    }
}