package day32_array;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {

        int[] nums = {4,1,60,-3,5,10};
        Arrays.sort(nums); //since arrays are mutable, we dont need to reassign it. the original array is now changed
        System.out.println(Arrays.toString(nums));

        //given an int array, find the max and min number

        System.out.println("Smallest number: " + nums[0]);
        System.out.println("Biggest number: " + nums[nums.length-1]);
    }
}
