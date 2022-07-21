package day34_methods;

public class GreetingMethod {

    /*
    make a method that will have the string parameter
    hello $name, how are you
     */

    public static void greeting (String name){
        System.out.println("Hello " + name + ", how are you");
    }

    public static void main(String[] args) {

        greeting("Ardit");
        greeting("James Bond");
    }
}
