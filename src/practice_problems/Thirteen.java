package practice_problems;

import java.util.Arrays;

public class Thirteen {

    public static void main(String[] args) {
        //a=4
        //4-1  -4 + 1    //5-1 4
        //4-1 == 3   -4 + 1 == -3   //-5+1 -4
//unique nums that sum up to 0

        int [] b = {3,4,2,6,2,65,23,5};
        int a = 5;


        int[] arr = new int[a];
        if (a % 2 == 0) {
            for (int i = 0; i < a; i += 2) {

                arr[i] = a - i;
                arr[i + 1] = -a + i;
            }

        } else {
            for (int i = 0; i < a - 1; i += 2) {

                arr[i] = a - i;  //2
                arr[i + 1] = -a + i; //-2
                arr[arr.length - 1] = 0;

            }

        }


        int arras [] = new int [3];
        int sum=0;
        if(arras.length==1){
            arras[0] = 0;
        }else {

            for (int i = 1; i < arras.length; i++) {
                arras[i] = i;
                sum += i;
            }
            arras[0] = -sum;

        }
        System.out.println(Arrays.toString(arras));
    }

    public static int [] sum0(int arr){
        int[] array = new int[arr];
        int sum = 0;
        if (arr==1){
            array[0]=0;
        }else
        for (int i = 1; i<arr;i++){
            array[i] = i;
            sum+=i;

        }
        array[0] = -sum;
        return array;
    }

}