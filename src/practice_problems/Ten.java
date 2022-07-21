package practice_problems;

import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {

        int[] arr = {3, 4, 65, 6, 76, 34, 2, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
