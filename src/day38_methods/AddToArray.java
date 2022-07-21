package day38_methods;

import java.util.Arrays;

public class AddToArray {

    /*
    create a method that will accept an int array and number
    we want to return a new array with the number added to the end of the array
    ex.  input {1,2,3}, 5
         output{1,2,3,5}
    */

    public static int [] addElement(int [] arr,int element){

        int [] newArr = new int [arr.length+1];

        for(int i = 0; i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;

        return newArr;


    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,};

        System.out.println(Arrays.toString(addElement(arr,5)));
    }



}
