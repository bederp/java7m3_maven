package bankapp.domain;

import java.util.Arrays;

public class Client {
    private String name;
    private Gender gender;

    private Account[] accounts;
    private int countOfAccounts;

    public Client(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.accounts = new Account[100];
        countOfAccounts = 0;
    }

    public void addAccount(final Account account) {
        accounts[countOfAccounts++] = account;
    }

    String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return Arrays.copyOf(accounts, accounts.length);
    }

    private String getClientGreeting() {
        if (gender != null) {
            return gender.getGreeting() + " " + name;
        } else {
            return name;
        }
    }

    @Override
    public String toString() {
        return getClientGreeting();
    }
}
