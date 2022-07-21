package day39_wrapper_arraylist;

public class Boxing {

    public static void main(String[] args) {

        int i = 100;
        Integer i2 = i;  //so i gets stored into i2

        System.out.println(i2);

        /*
        i is a primitive type. we store i into i2 which is wrapper class
        primitive type -> wrapper class object
        autoboxing
         */

        Integer i3 = 600; //autoboxing
        int z = i3; //unboxing. goes from wrapper class object to primitive type



    }
}
