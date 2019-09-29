package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount=amount + sum;
        System.out.println("Положил деньги на счет " + sum );
    }

    public double withdraw(double sum) throws LimitException {
            if (amount < sum) {
                throw new LimitException("Недостаточно средств", amount);
            }
            amount = amount - sum;
        System.out.println("Сняли " + sum);
            return amount;
    }
}