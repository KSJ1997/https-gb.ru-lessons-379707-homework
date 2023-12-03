package ru.geekbrains.lesson4;

public abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной");
        }
        balance += amount;
        System.out.println("Депозит в размере " + amount + " успешно проведен. Текущий баланс: " + balance);
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;
}
