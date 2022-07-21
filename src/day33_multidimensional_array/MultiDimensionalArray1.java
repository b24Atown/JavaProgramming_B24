package day33_multidimensional_array;

import java.util.Arrays;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {

        int [] a = {1,2,3}; //single dimensional
        int [] b = {4,5,6}; //single dimensional

        int[][] all = {a,b};//2d array

        System.out.println(Arrays.toString(all[0]));//how to print first element of 2d array
        System.out.println(Arrays.toString(all[1]));//how to print 3rd element of 2d array
        System.out.println(all.length); //2 elements so length of 2

        System.out.println(Arrays.deepToString(all));//how to print whole 2d array
    }
}
