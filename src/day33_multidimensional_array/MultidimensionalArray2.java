package day33_multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray2 {

    public static void main(String[] args) {

        int [][] arr = {
                {10,20,30,40},
                {100, 200, 300, 400},
                {1000,2000}
        };
        System.out.println(arr.length); //length of the 2d array...3 since it has 3 elements

        System.out.println(arr[0].length);//length of first element...4
        System.out.println(Arrays.toString(arr[0]));//prints first element..10,20,30,40

        System.out.println(arr[2].length);//length of 3rd element
        System.out.println(Arrays.toString(arr[2]));//printing 3rd element

        //printing first element of each array
        System.out.println("First array " + arr[0][0]);//read first number of first array
        System.out.println("Second array " + arr[1][0]);//read first num of 2nd array
        System.out.println("Third array " + arr[2][0]);//read first num of 3rd array
    }
}
