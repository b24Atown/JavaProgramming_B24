package day49_encapsulation;

public class ReviewStatic1 {

    public static void main(String[] args) {
// no logic here just reviewing things
        System.out.println("A");
        // new ReviewStatic1();  -- calling the constructor
        //method1()   -- calling the method
    }
    public ReviewStatic1(){ //this is called a constructor because it has the name of the class
        System.out.println("B");
    }

    static {
        System.out.println("C");
    }
    public static void method1(){  //this is called a method
        System.out.println("D");
    }
}
