package ru.geekbrains.lesson4;

public class CreditAccount extends Account {
    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств для снятия", balance);
        }
        balance -= amount;
        System.out.println("Снятие со счета в размере " + amount + " успешно проведено. Текущий баланс: " + balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной");
        }
        balance += amount;
        System.out.println("Депозит в размере " + amount + " успешно проведен. Текущий баланс: " + balance);
    }
}
