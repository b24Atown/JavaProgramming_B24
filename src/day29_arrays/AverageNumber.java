package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();

        int [] nums = new int [size];
        //we asked the user how many numbers they want to enter and stored into a size variable. but really all they entered in was the number 5. the next code we made it so that the number they enter in means thats how many inputs will be accepted. we could have also done int[] nums = new int [5]; but we kept it dynamic since they can always change the value with scanner.

        for(int i = 0; i<nums.length;i++){ //can also say i< size;
            System.out.println("Enter a number " + (i+1)); //i starts at 0 so we did i+1 to have it count from 1.
            nums[i] = input.nextInt();//this allows the nums array to be entered in by scanner

        }
        System.out.println(Arrays.toString(nums));

       // int [] nums = {4,6,2,10}; hardcoded number int array

        double sum = 0;

        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];

        }
        System.out.println("Average number is: " + sum/ nums.length);
    }
}
