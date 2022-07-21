package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        /*
        declare an int array
        count how many even numbers there is
        count how many odd numbers there is
        print counters
        not hard coded initial array, traditional for loop and for each loop
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();
        int [] nums = new int[size];
        for(int i = 0; i<nums.length;i++){
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
        }

       // int [] nums = {9,24,5,1,5,29,52};  //hard coded way
        int even = 0;
        int odd = 0;

        String evenNumbers = "";
        String oddNumbers = "";


        //for each loop

//        for (int eachNum : nums){
//            if(eachNum %2==0){
//                even++;
//                evenNumbers+= eachNum + " ";
//            } else {
//                odd++;
//                oddNumbers+= eachNum + " ";
//            }
//        }

        //for loop

        for(int i = 0; i<nums.length;i++) {
            if (nums[i] %2==0){
                even++;
                evenNumbers+= nums[i] + " ";
            }else {
                odd++;
                oddNumbers+= nums[i] + " ";
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(even + " count of even numbers");
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println(odd + " count of odd numbers");
        System.out.println("Odd numbers: " + oddNumbers);

    }
}
