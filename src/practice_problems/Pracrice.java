package practice_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Pracrice {

    public static void main(String[] args) {
        int [] arr = {3,4,6,3,2,5,77,5,2,3,8}; //which number within the array is the biggest

        Arrays.sort(arr);
        int biggest = arr[arr.length-1];
        System.out.println(biggest);


//        int biggest = arr[0];
//
//        for(int each : arr){
//
//            if (each>biggest){
//                biggest = each;
//            }
//
//        }
//        System.out.println(biggest);

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();//3

        int [] nums = new int [size];//3


        for(int i = 0; i<nums.length;i++){
            System.out.println("Enter a number");
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));

    }
}
