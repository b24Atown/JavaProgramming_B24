package day13_if_statements;

import java.util.Scanner;

public class YesorNo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name");
        String firstName = input.next();

        System.out.println(firstName + " do you like soccer");
        String likeSoccer = input.next();

        if (likeSoccer.equals("yes") || likeSoccer.equals("Yes") || likeSoccer.equals("YES")) {
            System.out.println("Who is your favorite team");
            String team = input.next();

            System.out.println("Oh i like " + team + " too");
        } else if (likeSoccer.equals("no")){
            System.out.println("Yeah soccer sucks");
        } else {
            System.out.println(firstName + " you didnt answer the question");
        }
    }
}
