package day10_scanner;
import java.util.Scanner;
public class Seconds {

    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner input = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");
        inputSeconds = input.nextInt();

        hours = inputSeconds / 3600;
        inputSeconds %= 3600;

        minutes = inputSeconds / 60;
        inputSeconds %= 60;

        seconds = inputSeconds;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");



        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String name1 = input.next();
        double subject1 = input.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this project");
        String name2 = input.next();
        double subject2 = input.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this project");
        String name3 = input.next();
        double subject3 = input.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this project");
        String name4 = input.next();
        double subject4 = input.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this project");
        String name5 = input.next();
        double subject5 = input.nextDouble();

        double averageGrade = (subject1 + subject2 + subject3 + subject4+ subject5) / 5;

        System.out.println("Summary: " + name1 + " - " + subject1 + ", " + name2 + " - " + subject2 + ", " + name3 + " - " + subject3 + ", " + name4 + " - " + subject4 + ", " + name5 + " - " + subject5 + ", ");
        System.out.println("Your average score is: " + averageGrade);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");



    }
}
