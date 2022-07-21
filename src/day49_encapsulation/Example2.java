package day49_encapsulation;

import java.util.Arrays;

import static java.util.Arrays.*;
//im importing all the static members from the arrays class. * means all.
import static java.lang.Math.*;
//importing static methods from java.lang.math class.
public class Example2 {

    public static void main(String[] args) {
        //can compare here with example1 to see difference.

        int [] a = {3,4,1,5,1};
        sort(a); //so now here no longer need to call class Array first.

        System.out.println(Arrays.toString(a));

        System.out.println(PI); // same thing with PI here now.
    }
}
