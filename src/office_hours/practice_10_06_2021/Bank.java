package office_hours.practice_10_06_2021;

import day53_inheritence.rules.B;

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("James Bond",30000,3013,"Checking");

        System.out.println(account);
        System.out.println(account.checkBalance(3013));
        account.withdraw(3333);
        System.out.println(account.checkBalance(3013));
        System.out.println(account.withdraw(100));
        System.out.println(account.withdraw(4444444));

    }
}
