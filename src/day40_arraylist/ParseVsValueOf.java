package day40_arraylist;

public class ParseVsValueOf {

    public static void main(String[] args) {

        String s = "30";

        System.out.println(s+5);//305

        int seconds = Integer.parseInt(s);//converts the 30 string into the int value of 30

        System.out.println(seconds<60);

        Integer num = Integer.valueOf(s); //converts the 30 strinig into the integer wrapper class object that has a value of 30. this method is not used often.

        System.out.println(num<60);

        String s2 = String.valueOf(seconds); //converts number into string. basicaly never used
        System.out.println(s2.charAt(0));//just to show it's an integer
        System.out.println(s2);

    }
}
