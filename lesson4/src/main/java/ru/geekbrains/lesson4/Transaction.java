package ru.geekbrains.lesson4;

public class Transaction {
    public static void transfer(Account source, Account target, double amount) {
        try {
            source.withdraw(amount);
            target.deposit(amount);
            System.out.println("Транзакция проведена успешно");
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка транзакции: " + e.getMessage() + ". Текущий баланс: " + e.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка транзакции: " + e.getMessage());
        }
    }
}
