package practice_problems;

public class  ArraysSecondMax {

    public static void main(String[] args) {

        int [] arr = {1,10,5,1,6,2,7,9,8,3};
        int [] arr2 = {1,3,4,9};

        System.out.println(secondMaxNoSorting(arr));

    }

    public static int secondMaxNoSorting(int [] arr){

        int max = arr[0];
        int secMax = -2147483648;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
            if(arr[i]> secMax && arr[i]!= max){
                secMax = arr[i];
            }
        }

        return secMax;

    }
}
