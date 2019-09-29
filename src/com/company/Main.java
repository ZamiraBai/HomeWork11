package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount client = new BankAccount();
        client.deposit(10000);
        while (true) {
            try {
                client.withdraw (6000);
            } catch (LimitException e) {
                System.out.println(e.getRemainingAmount());
                e.printStackTrace();

                double sum = client.getAmount();
                if(e.getRemainingAmount()>=client.getAmount()){

                    System.out.println("Снимаем остаток на счету " + sum);
                    sum = e.getRemainingAmount()-e.getRemainingAmount();
                    System.out.println("Остаток на счету после всех операций " + sum);
                }
                break;
            }
        }

    }
}
