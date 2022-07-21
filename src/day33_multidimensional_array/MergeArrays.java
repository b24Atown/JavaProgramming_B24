package day33_multidimensional_array;


import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int [][] nums = {
                {10,20,30}, {5,10,15}
        };
        //take the elements from the 2nd array and put all the numbers into a single array.
        //format: all elements from first, then all from the second etc..

        //could have also just done int[] merged = new int [nums[0].length + nums[1].length];
        int size = nums[0].length + nums[1].length;
        int [] merged = new int [size];
        merged [0] =nums[0][0];
        merged [1] = nums[0][1];
        merged [2] = nums[0][2];
        merged [3] = nums [1][0];
        merged [4] = nums[1][1];
        merged [5] = nums[1][2];

        Arrays.sort(merged);//sort just because

        System.out.println(Arrays.toString(merged));

    }
}
