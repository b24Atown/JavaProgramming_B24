package day31_arrays;

import java.util.Arrays;

public class SplitExample1 {

    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday";

        //split up a string into a string array

        String [] days = s.split(",");//so it sees the comma, removes it and prints
        System.out.println(Arrays.toString(days));

        String s2 = "Jan-Feb-Mar-Apr";

        String [] month = s2.split("-"); // sees -, removes it and prints
        System.out.println(Arrays.toString(month));

        for (String each:month){
            System.out.println(each);
        }

    }
}
