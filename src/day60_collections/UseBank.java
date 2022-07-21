package day60_collections;


public class UseBank {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.balance = 500;

        bank.withDraw(250);
        //bank.withDraw(1000); cause exception

        bank.balance = -10;
        bank.withDraw(20);
    }
}
