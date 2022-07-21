package day11_if_statemenments;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
public class Practises {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String purchase = input.next();

        int Blanket = 60;
        int Charger = 25;
        int Hat =  25;
        int Headphones = 30;
        int Laptop = 200;
        int Pants = 50;
        int Pillow = 40;
        int Smartphone = 1000;
        int Socks = 5;
        int UsbCable = 10;
        int giftCard = 100;
        int balance;

        if (purchase.equals("Blanket")) {
            balance = giftCard - Blanket;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance+ "$");

        } else if (purchase.equals("Charger")) {
            balance = giftCard - Charger;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        } else if (purchase.equals("Hat")) {
            balance = giftCard - Hat;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        }else if (purchase.equals("Headphones")) {
            balance = giftCard - Headphones;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        }else if (purchase.equals("Pants")) {
            balance = giftCard - Pants;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance+ "$");
        }else if (purchase.equals("Pillow")) {
            balance = giftCard - Pillow;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        }else if (purchase.equals("Socks")) {
            balance = giftCard - Socks;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        }else if (purchase.equals("USB cable")) {
            balance = giftCard - UsbCable;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is " + balance + "$");
        } else if (purchase.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (purchase.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }


        double cupcake = 1.5;
        double donut = 1.6;
        double eclair = 2.1;
        double froyo = 2.2;
        double gingerbread =2.3;
        double honeycomb = 3.1;
        double iceCreamSandwich = 4.0;
        double jellyBean = 4.1;
        double kitKat = 4.4;
        double lollipop = 5.0;
        double oreo = 8.0;
        double pie = 9.0;

    }
}
