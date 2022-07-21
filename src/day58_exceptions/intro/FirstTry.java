package day58_exceptions.intro;

public class FirstTry {

    public static void main(String[] args) {

        System.out.println("First Line");

        try {
            String s = "java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));//trying to make it give exception
        }catch (StringIndexOutOfBoundsException e){ // e is the common reference name used for exceptions. same way as i is used for loops.
            System.out.println("We got exception");
            e.printStackTrace();//this line will allow the exception to show up that normally does but without stopping flow or anything. so would be used as a debug feature.

        }
//this allowed us to have the program keep running after the bug.

        System.out.println("Last line");


    }
}
