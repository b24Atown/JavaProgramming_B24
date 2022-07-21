package day38_methods;

public class ArrayAsParameter {

    public static void main(String[] args) {

        int [] a = {1,2,4};

        printArray(a);
        System.out.println();
        printArray(1,2,4,4,3);//when we put the ... instead of int [] arr. it allows us to make an array automatically when we use the method. without this we had to make an array and then print it. this prints automatically with whatever aray we want.

        String [] arr = {"word","word2"};
        printArray(arr);

        //since we havent made it a variable argument(...) we can't use this    printArray("example","Example");
   }

    public static void printArray(int ... arr){
        for(int each: arr){
            System.out.println(each);
        }
    }

    public static void printArray(String [] arr){
        for(String each : arr){
            System.out.println(each);
        }
    }
}
