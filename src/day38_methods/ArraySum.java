package day38_methods;

public class ArraySum {

    /*
    create a method that will take an array and return the sum of all the elements
     */

    public static int sumOfElements(int [] arr){
        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
//for each loop

    public static int sumOfElements1 (int [] arr2){
        int sum = 0;

        for(int num: arr2){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,1,5};
        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements1(arr));
    }
}
