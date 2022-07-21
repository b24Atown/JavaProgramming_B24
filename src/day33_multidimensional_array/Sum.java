package day33_multidimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {

        //given an array, I want to calculate the sum and put the sum value to a new element at the end

        int [] arr = {1,5,2,5};
        //1 5 2 5 13
        int sumOf = 0;

        for (int i = 0; i<arr.length;i++){
            sumOf+= arr[i];

        }
        int [] copy = Arrays.copyOf(arr,arr.length +1);
        copy[copy.length -1] = sumOf;

        System.out.println(Arrays.toString(copy));


        //can also do this by doing int [] newArr = new int [arr.length +1]
        //then make for loop and add each variable in with i. so for example arr[i] = copy[i]...then do the sum as well, and use the last line we did here to give the sum value as the last value.
    }
}
