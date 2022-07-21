package day32_array;


import java.util.Arrays;

public class ArraysEquals {

    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = {3,2,1};
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(b,c));

        Arrays.sort(c);

        System.out.println(Arrays.equals(a,c));


    }
}
