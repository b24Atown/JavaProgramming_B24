package my_utilities;

public class IndexOfMethod {

    /*(
    create a method that will accept an array and an element
    return the index of the first occurrence of the element
    if the element does not exist in our array, we will return -1
     */

    public static void main(String[] args) {
        String [] arr = {"a","b","c"};
        int index = indexOf(arr,"c");
        System.out.println(indexOf(arr,"b"));//1
        System.out.println(index);//2
    }

    public static int indexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;

            }
        }
        return -1;

    }
}
