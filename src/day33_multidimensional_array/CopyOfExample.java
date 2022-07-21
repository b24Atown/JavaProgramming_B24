package day33_multidimensional_array;

import java.util.Arrays;

public class CopyOfExample {

    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = a;//this creates a copy of b into a but whatever changes in b or a will change in both. so not proper way to use this method.
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int [] c = {20,30,40};
        int [] d = Arrays.copyOf(c,3);//betterway is use c,c.length
        //this is proper way to copy. copies elements of c array and you can also choose a size. so you can do a bigger size and the additional numbers will be 0's.
        int [] e = Arrays.copyOf(c,c.length + 2 );

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));


    }
}
