package day49_encapsulation;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        int []a = {3,4,1,5,1};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //we can assume these 2 methods are static.
        System.out.println(Math.PI); // we can assume pi is static
        //again because were doing .pi   were doing .sort  .toString and  its being referenced by the class name. you can tell because its capitalized. and no object was created. so it wasnt   like Arrays a = new Arrays; (new keyword wasnt used).
    }
}
