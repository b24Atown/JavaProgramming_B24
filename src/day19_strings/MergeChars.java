package day19_strings;

public class MergeChars {
    /*
    String one: abc
    Strring two: def
    merrge to get abcdef

     */
    public static void main(String[] args) {

        String one = "abc";
        String two = "def";
        String combine = "" + one.charAt(0) + one.charAt(1) + one.charAt(2) + two.charAt(0) + two.charAt(1) + two.charAt(2);
        System.out.println(combine);

        System.out.println("-----------------");
        //or

        String merged = "";

        merged += one.charAt(0);
        merged += one.charAt(1);
        merged += one.charAt(2);
        merged += two.charAt(0);
        merged += two.charAt(1);
        merged += two.charAt(2);
        System.out.println(merged);
        //we concantinated here as well. so firrst one is concanting "" with one.charAt(0);
    }
}
