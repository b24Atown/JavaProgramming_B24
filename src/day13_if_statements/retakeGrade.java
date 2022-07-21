package day13_if_statements;

import java.util.Scanner;

public class retakeGrade {

    public static void main(String[] args) {

        /*
        [If statements, operators]

Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What attempt number is this");
        int attempt = input.nextInt();

        System.out.println("What isi your grade after first attempt" + attempt);
        double grade = input.nextDouble();

        double finalGrade = 0;

        if (attempt == 1){
            finalGrade = grade * 0.9;
        }
        else if ( attempt  == 2) {
            finalGrade = grade * 0.8;
        }
        else if (attempt == 3); {
            finalGrade = grade * .65;
        }
        System.out.println("After attempt " + attempt + " your final grade is " + finalGrade);

    }
}
