package day32_array;

import java.util.Arrays;

public class StringSortArray {

    public static void main(String[] args) {

        String [] strs = {"java", "8eight","Hello","hello","HEllo","$dollar","words5","$apple"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        //so sorts from special character,numbers,uppercase,lowercase. uses first letter first, then second and so on.
    }
}
