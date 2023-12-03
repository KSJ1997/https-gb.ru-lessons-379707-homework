package ru.geekbrains.lesson4;

public class DebitAccount extends Account {
    public DebitAccount(double initialBalance) {
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
}
