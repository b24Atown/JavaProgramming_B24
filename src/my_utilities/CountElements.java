package my_utilities;

public class CountElements {

    /*
    create a method that accepts an int array and a number
    count and return the number of times the given number is found in the array

    return type: int
    ex. input {1,2,5,1,4,1},1
    output 3
     */

    public static int frequencyOfElement (int [] arr, int element){
        int [] arra = new int [arr.length];

        int count = 0;

        for(int each: arr){
            if(each == element){
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,1,4,1};
        System.out.println(frequencyOfElement(arr,1));

        getUniqueElement(arr);
    }

    public static void getUniqueElement (int[] nums){
        for(int each: nums){
            int count = frequencyOfElement(nums,each);
            if(count==1){
                System.out.println(each);
            }
        }
    }

}
