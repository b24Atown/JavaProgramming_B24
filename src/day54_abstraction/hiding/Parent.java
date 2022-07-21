package day54_abstraction.hiding;

public class Parent {

    public static void hello(){
        System.out.println("hello from parent");
    }
}

class Child extends Parent {
// here we are hiding static method, but not overriding. the diffeerence here is that both exist now at the same time.
    public static void hello(){
        System.out.println("hello from child");
    }

}

class Main {
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
        // static method cannot be overridden. but we can hide it.
    }
}
