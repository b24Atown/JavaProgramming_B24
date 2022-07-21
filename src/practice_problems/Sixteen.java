package practice_problems;

import java.util.Arrays;

public class Sixteen {

   // 16. Write a return method that can concate two arrays

    public static void main(String[] args) {

        String [] one = {"Hi","bye"};
        String [] two = {"Hello","yes"};

        System.out.println(Arrays.toString(combineArray(one,two)));

    }

   public static String [] combineArray(String [] one, String [] two){

        String [] arr = new String[one.length+two.length];
        int index = one.length;

        for(int i = 0; i<index;i++){
            arr[i] = one[i];
        }
        for(int i = 0; i<two.length;i++){
            arr[index++] = two[i];
        }
        return arr;

   }
}
