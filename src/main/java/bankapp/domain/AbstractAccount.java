package bankapp.domain;

public abstract class AbstractAccount implements Account {
    private int id;
    private double balance;

    AbstractAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public void deposit(final double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(final double amount) {
        balance -= amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getBalance() {
        return balance;
    }

}
