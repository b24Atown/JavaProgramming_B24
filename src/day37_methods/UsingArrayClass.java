package day37_methods;

import my_utilities.ArraysUtil;

import java.util.Arrays;

public class UsingArrayClass {

    public static void main(String[] args) {

        int [] a = {4,5,159,19,19,299};

        System.out.println(ArraysUtil.maxNumberr(a));
        System.out.println(ArraysUtil.minNumber(a));

        System.out.println(ArraysUtil.contains(a,5));
        System.out.println(ArraysUtil.contains(a,50));


    }


}
