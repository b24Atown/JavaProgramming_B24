package day39_wrapper_arraylist;

public class ValueOfExample {

    public static void main(String[] args) {

        String s = "50";
        Integer i =Integer.valueOf(s);//turned s into an integer but wrapper class
        int i2 = Integer.valueOf(s);//unboxing
        System.out.println(i);
        System.out.println(i2);

    }
}
