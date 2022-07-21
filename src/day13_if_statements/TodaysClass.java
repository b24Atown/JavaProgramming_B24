package day13_if_statements;

import java.util.Scanner;

public class TodaysClass {

    public static void main(String[] args) {

// day
        //monday, wednesday, thursday, saturday, sunday
        // -> java
        //tuesday
        // -> soft skills
        // friday
        // -> off

       // Scanner input = new Scanner(System.in); // scanner method
        //String day = input.next();
        String day = "tuesday";

        boolean isTechnicalDay = day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean isSoftSkills = day.equals("tuesday");

        boolean isFriday = day.equals("friday");

        if ((isTechnicalDay)) {
            System.out.println("java");
        } else if (isSoftSkills) {
            System.out.println("is soft skills");
        } else if (isFriday) {
            System.out.println("off day");

        } else {
            System.out.println("invalid day given");
        }
    }
}