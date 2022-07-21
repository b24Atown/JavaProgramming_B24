package day54_abstraction.hiding;

public class Run {

    public static void main(String[] args) {

        A a = new A();
        a.instanceMethodA();
        a.staticMethod();

        System.out.println();

        B b = new B();
        b.instanceMethodB();
        b.staticMethod();
        b.instanceMethodA();
    }
}
