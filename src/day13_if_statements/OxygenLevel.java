package day13_if_statements;

import java.util.Scanner;

public class OxygenLevel {

    public static void main(String[] args) {

        /*You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%

         */

        //int oxygenLevel = 80; how to do without scanner
        Scanner input = new Scanner(System.in);

        int oxygenLevel = input.nextInt();
        String message = "";

        if(oxygenLevel>=90) {
            message = "Your tank is full";
        } else if (oxygenLevel >=80) {
            message = "Still ok";
        } else if (oxygenLevel >=70) {
            message = "Dont go too far";
        }  else if (oxygenLevel >=60) {
            message = "Start to head back";
        } else if ( oxygenLevel >= 50) {
            message = "Be careful now you are at 50%";
        } else {
            message = "Below 50";
        }

        System.out.println(message);


        //2nd way to do it

        /*if(oxygenLevel >=50 && oxygenLevel <60) {
            message = "be careful now you are at 50%";
        } else if ( oxygenLevel >=60 && oxygenLevel <70){
            message = "Start to head back";
        } else if (oxygenLevel >= 70 && oxygenLevel <80) {
            message = "Dont go too far";
        } else if (oxygenLevel >= 80 && oxygenLevel <90) {
            message = "Still ok";
        }    else if (oxygenLevel >= 90 && oxygenLevel <100) {
            message = "Your tank is full";
        }    */



    }
}
