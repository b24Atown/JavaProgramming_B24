package day33_multidimensional_array;

import java.util.Arrays;

public class RecapArraysClass {

    public static void main(String[] args) {

        int [] arr = {4,1,-4,60,-100,30};
        int [] arr2 = {30,60,-4,1,-100,4};

        System.out.println(Arrays.equals(arr,arr2));//even though its the same numbers it comes out to false so order matters

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr,arr2));//now that theyre sorted it comes as true.


    }
}
