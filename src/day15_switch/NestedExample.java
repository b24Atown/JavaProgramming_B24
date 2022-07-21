package day15_switch;

import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // just used as an example to follow the flow

        System.out.println("Enter a score");
        int score = input.nextInt();

        if (score >=75){
            System.out.println("Good score, keep working hard");

            if (score >=90) {
                System.out.println("You get 5 gold stars");
            } else if (score >=80){
                System.out.println("You get 4 gold stars");
            }else {
                System.out.println("you get 3 gold stars");
            }
        } else{
            System.out.println("Good try");
            if (score>=60){
                System.out.println("you get one star");
            }
            if (score>=50){
                System.out.println("You should retake it");
            } else {
                System.out.println("Retake it twice");
            } //keep in mind here. there is no else if so example anything more than 60 will keep printing the other conditions as well. for else if then only one thing will print.

        }
    }
}
