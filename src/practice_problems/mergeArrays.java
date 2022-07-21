package practice_problems;

import java.util.Arrays;

public class mergeArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {10,20,30,40,50,60};
        int [] merged = new int[arr1.length + arr2.length];
        int index = arr1.length;

        for(int i = 0; i<arr1.length;i++){
            merged[i] = arr1[i];
        }
        for(int i = 0; i<arr2.length;i++){
            merged[index++] = arr2[i];
        }
        System.out.println(Arrays.toString(merged));

        //merge intertwined
        int [] merged2 = new int [merged.length];

        int j = 0;
        for(int i = 0; i<merged2.length;){
            if(j<arr1.length) {
                merged2[i++] = arr1[j];
            }
            if(j<arr2.length){
                merged2[i++]= arr2[j++];
            }else {
                j++;
            }

        }
        System.out.println(Arrays.toString(merged2));
    }
}
