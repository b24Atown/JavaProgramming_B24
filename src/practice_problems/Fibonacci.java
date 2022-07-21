package practice_problems;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {

        int numInSequence = 9;

        int [] nums = new int[numInSequence];

        nums[0] = 0;
        nums[1] = 1;

        for (int i = 0; i<nums.length-2;i++){
            nums[i+2] = nums[i] + nums[i+1];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]); //last num in the sequence in case this  is what they ask

        for (int i = 2; i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        System.out.println(Arrays.toString(nums));
    }
}

