package day19_strings;

public class SubstringExample {
    public static void main(String[] args) {

        /*
        substring allows you to take part of the string based on tthe given index number
        when you give one number, that is that starrting of your substring and it keeps all the charadters until the end.
         */

        //          0123456789
        String s = "javascript";

        System.out.println(s.substring(1));//starting from that position and keeping all the letters from there on. so we get avascript
        System.out.println(s.substring(2));
        System.out.println(s.substring(4));

        System.out.println(s.substring(0, 3));//on this one it includes position 0 but not 3. everything from before there.
        System.out.println(s.substring(4));

        System.out.println(s.substring(2,6));//so this would be vasc




    }
}
