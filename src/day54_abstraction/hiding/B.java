package day54_abstraction.hiding;

public class B extends A{

    public static void staticMethod(){
        System.out.println("B"); //this isnt being overriden, its hiding class A method
    }

    public void instanceMethodB(){
        staticMethod();
    }
}
