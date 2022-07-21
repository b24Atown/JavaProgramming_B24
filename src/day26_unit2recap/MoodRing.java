package day26_unit2recap;

import java.util.Scanner;

public class MoodRing {

    public static void main(String[] args) {

        /*
        mood ring [switch]
        you have a mood ring and need to know what mood you are in based on the color. the color will also provide   that is suggested for shopping
        data:
        pink:
           mood: happy
           budget: 200
        blue: mood: relaxed
              budget:150
        orange:
              mood"nervous
              budget50
         */
        Scanner input = new Scanner(System.in);

        System.out.println("What is the mood ring color");
        String color = input.next();

        String mood = "";
        double budget = 0;


        switch (color){
            case "pink":
                mood = "happy";
                budget = 200;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150;
                break;
            case "orange":
                mood = "nervous";
                budget = 50;
                break;
            case "red":
                mood = "angry";
                budget = 0;
                break;

        }
        System.out.println("'your color was:" + color);
        System.out.println("which means you " + mood);
        System.out.println("your mood means you can spend $" + budget);

    }
}
