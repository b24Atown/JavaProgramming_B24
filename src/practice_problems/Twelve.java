package practice_problems;

import java.util.Arrays;

public class Twelve {

    public static void main(String[] args) {

//        Array -- Sort Descending
//        Write a return method that can sort an int array in descending order without using the sort method of the Arrays
//        class
//
//        Ex:  int[] arr = {10,20,7, 8, 90};
//
//        arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

        int [] arr = {4,77,2,5};
        System.out.println(Arrays.toString(sortDescendingArray(arr)));


    }

    public static int [] sortDescendingArray (int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }

        return arr;
    }
}
