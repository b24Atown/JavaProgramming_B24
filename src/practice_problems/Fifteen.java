package practice_problems;

import java.util.Arrays;

public class Fifteen {

    public static void main(String[] args) {

        /*
        Q15:
Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]


         */

        // i 1  0   2  0  3  4   0
        //j 1  0   2  0  3  4  0

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] arr2 = {1, 0, 2, 0, 3, 0, 4, 0};

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]!=0){
                    break;
                }
//
                if(arr[j]!=0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(moveZeros(arr2)));
    }

    public static int[] moveZeros(int[] arr) {

        int[] a = new int[arr.length];//{2,0,5,7,0}
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                a[x++] = arr[i];//{2,5,7,0,0}

            }
        }

        return a;
    }

    public static int [] mo(int [] arr){
        int [] arr2 = new int[arr.length];
        int index = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>0){
                arr2[index++] = arr[i];
            }
        }
        return arr2;
    }
}
