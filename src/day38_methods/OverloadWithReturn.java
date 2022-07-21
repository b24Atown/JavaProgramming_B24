package day38_methods;

public class OverloadWithReturn {

    /*
    changing return type doesnt overload the method. ex

    public static int method(){
        System.out.println("void method = no parameters");

    }
    so return type doesnt overload the method.
    you need to overload the method by changing the parameters. (once parameters are changed, then you can change return type if you want to). see ex 2 as compared to the version that doesn work uptop.

     */

    public static void method(){
        System.out.println("void method-no parameters");
    }

    public static int method(int a){
        System.out.println("void method = int parameters");
        return 0;
    }

    public static String method(String s){
        System.out.println("String method = String parameters");
        return "a";
    }
}
