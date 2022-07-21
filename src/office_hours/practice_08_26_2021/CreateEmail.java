package office_hours.practice_08_26_2021;

import java.util.Scanner;

public class CreateEmail {
    public static void main(String[] args) {

        //ask user to enter two strings. both strings should be at least 6 characters long. if they are shorter than that print invalid data" and program should end.
        //if the information provided is valid, you will take the first 4 characters of the first string and combine them with the last three characters of the second string. at the end of your combined string add "@cybertek.com" and print the final string as your created email. the final email should be in all lowercase.
        //input jamesBond Secret    output: jameret@cybertek.com

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String wordOne = input.nextLine();
        System.out.println("Enter a string");
        String wordTwo = input.nextLine();

        String one = wordOne.substring(0,4).toLowerCase();
        String two = wordTwo.substring((wordTwo.length()-3)).toLowerCase();


        if(wordOne.length() >=6 && wordTwo.length()>=6){

            System.out.println("" + one + two + "@cybertek.com");

        } else{
            System.out.println("Invalid data");
        }
    }
}
