package ru.geekbrains.lesson4;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите начальный баланс счета: ");
            double initialBalance = scanner.nextDouble();
            Account account = new DebitAccount(initialBalance);

            System.out.print("Введите сумму депозита: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Введите сумму для снятия: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println("Создаем второй счет для транзакции...");
            System.out.print("Введите начальный баланс второго счета: ");
            double secondInitialBalance = scanner.nextDouble();
            Account secondAccount = new CreditAccount(secondInitialBalance);

            System.out.print("Введите сумму для транзакции: ");
            double transactionAmount = scanner.nextDouble();
            Transaction.transfer(account, secondAccount, transactionAmount);

        } catch (IllegalArgumentException | InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
