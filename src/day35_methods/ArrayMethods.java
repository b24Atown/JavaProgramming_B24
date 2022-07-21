package day35_methods;

public class ArrayMethods {

    /*
    make a method that accepts the array. find and print the first element
    make a method that accepts the array, find and print the last elemtn
    find and print the middle element
     */

    public static void getFirstArrayElement(int [] nums){

            System.out.println("First element: " + nums[0]);
        }

    public static void getLastArrayElement(int [] nums){
        System.out.println("Last element: " + (nums.length-1));
}
   public static void getMiddleArrayElement(int [] nums){
        if(nums.length %2==1){ //odd length
            System.out.println("Middle element: " + nums[nums.length/2]);
        }else{ //even length  012345   6/2 -> 3 6/2-1 ->2
            System.out.println("First Middle element: " + nums[nums.length/2-1]);
            System.out.println("Second Middle element: " + nums[nums.length/2]);
        }
   }

    public static void main(String[] args) {
        int [] a = {50,5,100,90,32};
        getFirstArrayElement(a);
        getLastArrayElement(a);
        getMiddleArrayElement(a);
    }
}
