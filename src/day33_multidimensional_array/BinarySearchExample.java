package day33_multidimensional_array;

import java.util.Arrays;

public class BinarySearchExample {

    public static void main(String[] args) {

        int [] nums = {1,55,100,200};

        System.out.println(Arrays.binarySearch(nums,55));//1
        System.out.println(Arrays.binarySearch(nums,200));//3
        //this is sorted so it will give you correct positions
        System.out.println(Arrays.binarySearch(nums,300));
        // negative number when it doesnt exist

        int [] numNot = {49,30,2,1,60,23};
        System.out.println(Arrays.binarySearch(numNot,30)); //-5
        System.out.println(Arrays.binarySearch(numNot,30));//-5
        //since it wasnt sorted it gives a negative number


    }
}
