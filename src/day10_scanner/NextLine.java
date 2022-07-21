package day10_scanner;
import java.util.Scanner;
public class NextLine {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();

        input.nextLine(); //you will needd this if you make a next line command

        System.out.println("Enter your full name");
        String fullName = input.nextLine();//this next line accepts the enter input from the previous so doesnt allow you to enter the value. to fix it you have to enter a blank next line command.

        System.out.println("Enter your address");//here the line wasnt needed again. the only time you will need to rewrite it is if your previous line was anything other than a next string.
        String address = input.nextLine();

        System.out.println(number);
        System.out.println(fullName);
        System.out.println(address);

    }
}
