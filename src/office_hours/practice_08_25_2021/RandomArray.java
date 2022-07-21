package office_hours.practice_08_25_2021;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
/*
1)Ask the user to enter how many numbers they want in their array
    2)Ask the user the max number they want for the random numbers
     –Use this as the bound for your random number
     3)Create an int array with random numbers.
      The number of elements is based on the given number
      Flow:How many numbers do you want: 5
      What is the max number value: 50
      -> Print the array with 5 random numbers from 0 to 50
 */
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want");
        int size = input.nextInt();
        System.out.println("What is the biggest number?");
        int maxNumber = input.nextInt();

        int [] num = new int[size];
        num[0] = 23;
        num[4] = 50;

        System.out.println(Arrays.toString(num));

    }
}
