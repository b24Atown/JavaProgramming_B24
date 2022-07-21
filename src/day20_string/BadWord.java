package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {

        /*
        given a String variable with a message. you will check if the message contains any of these bad words: "idiot, dumb, heck"
        If the message contains any of those words print: "Message not sent". If the message is bad word free print "Message sent"

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine().toLowerCase();
        boolean hasBadWord = message.contains("idiot") || message.contains("dumb") || message.contains("heck");

        if (hasBadWord){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }

    }
}
