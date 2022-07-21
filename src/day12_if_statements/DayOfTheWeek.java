package day12_if_statements;

public class DayOfTheWeek {

    /*
    1-Monday
    2-Tuesday
    ...
    7-Sunday
     */
    public static void main(String[] args) {

        /*      *//*int day = 99;

        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day ==4 ) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day number");*//*
        }*/

        int day = 6;
        String result = "";

        if(day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result =  "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day number";

        }
        System.out.println(result);



    }

}
