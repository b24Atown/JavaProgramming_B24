package day16_switch;


public class DaysInWeek {
    public static void main(String[] args) {

        /*
        Write a program that will display the given day based on a number input.
        Start with 1 for monday and up to 7 for Sunday. handle the invalid day numbers
         */


        int num = 3;
        String date = "";

        switch (num){
            case 1: date = "Monday";
            break;
            case 2:date = "Tuesday";
            break;
            case 3:date = "Wednesday";
            break;
            case 4:date = "Thursday";
            break;
            case 5:date = "Friday";
            break;
            case 6:date = "Saturday";
            break;
            case 7:date = "Sunday";
            break;
            default : date = "Invalid day";


        }
        System.out.println(date);

    }
}
