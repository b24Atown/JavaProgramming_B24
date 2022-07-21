package my_utilities;

public class ArraysUtil {

    /*
    this method will accept an int array and return the min number from the array
     */

    public static int minNumber (int [] arr){

        int min = arr[0];

        for(int each : arr){
            if(each<min){
                min = each;
            }
        }
        return min;

    }
    //this method will accept an int arr and return the max number from the array

    public static int maxNumberr (int [] arr){

        int max = arr[0];

        for(int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    //accepts an int array and an int num. sees if num is contained in the array

    public static boolean contains(int [] arr,int num){
        for(int each: arr){
            if(each == num){
                return true;
            }
        }

        return false;
    }
    //sum of elements in an int array

    public static int sumOfElements(int [] arr){
        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    //take an array, and a number and create a new array with the number in it

    public static int [] addElement(int [] arr,int element){

        int [] newArr = new int [arr.length+1];

        for(int i = 0; i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;

        return newArr;


    }
    /*
    {1,2,4} , {4,5}
    [0,0,0,0,0,]
     */

    public static int [] addElement (int [] arr, int [] elementsToAdd){

        int [] newArr = new int [arr.length+elementsToAdd.length];

        int index = 0;

        for(int each:arr){
            newArr[index++] = each;
        }
        for(int each:elementsToAdd){
            newArr[index++] = each;
        }
        return newArr;

    }

    //takes an array and a number, checks how often the number is in the array.

    public static int frequencyOfElement (int [] arr, int element){

        int count = 0;

        for(int each: arr){
            if(each == element){
                count++;

            }
        }
        return count;

    }

    public static void getUniqueElement (int[] nums){
        for(int each: nums){
            int count = frequencyOfElement(nums,each);
            if(count==1){
                System.out.println(each);
            }
        }
    }
    // checks a number and sees if its in the array. gives index

    public static int indexOf (int[]nums,int element){
        for (int i = 0; i<nums.length;i++){
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
    //string version

    public static int indexOf(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;

            }
        }
        return -1;

    }
}
