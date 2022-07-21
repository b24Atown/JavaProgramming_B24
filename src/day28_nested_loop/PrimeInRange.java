package day28_nested_loop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        //loop that goes from 2 to any range

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your range");
        int range = input.nextInt();

        for (int number = 2; number < range; number++) {

            boolean isPrime = true; //its in the loop because we want to reset it back to default.

            for (int j = 2; j < number; j++) {

                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(number + " ");
            }

        }

    }
}
