package practice_problems;

import java.util.Arrays;

public class Eleven {

    public static void main(String[] args) {
        /*
        Q11:
Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
         */
        int [] arr = {4,77,2,5};
        System.out.println(Arrays.toString(sortAscendingArray(arr)));

    } //4  77  2  5   i  // temp = 4    //2  77  2  5
      //4  77  2  5   j                 //2 77 4   5

    public static int [] sortAscendingArray (int [] arr){

        for(int i = 0; i<arr.length;i++){
            int temp = 0;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                }

            }

            }
        return arr;

    }
}
