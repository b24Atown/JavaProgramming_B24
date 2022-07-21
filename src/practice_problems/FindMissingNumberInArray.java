package practice_problems;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int [] arr = {3,1,5,6,4,7,8,9,2,11};

        System.out.println(missingNum(arr));

    }

    public static int missingNum(int[] arr){
        Arrays.sort(arr);
        int num = 1;

        for(int i = 0; i<arr.length;i++){
            if(num!=arr[i]){
                break;

            }
            num++;
        }
        return num;
    }
}
