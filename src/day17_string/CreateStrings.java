package day17_string;

public class CreateStrings {
    public static void main(String[] args) {

        String first = "java"; //String literal (creates a string object in the string pool

        String second = new String("java"); // String using new.
        //disregard the original. just type new String("java");
        //creates a String object in the heap. NOT the string pool.

        System.out.println(first == second); // == with String doesnt check value, it checks memory location and compares them.
        //when you run this, you see it comes to false.
        System.out.println(first.equals(second)); // .equals checks the actual value, not memory location. so it will come out as true.

        String third = "java";
        System.out.println(first == third); // again since this checks memory location, it will show as true. it is not checking the value of the string. this is why you never want to use == when comparing strings.

        /*

                    first ->                "java"         <- third


                     second ->                    {   "java"    }

            so again first and third refer to same java. second is a whole new one. they're all stored within the heap, but first and third are stored in the pool.
             */


    }
}
