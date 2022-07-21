package day56_polymorphism.learn_interface;

public interface Mac {

    String NAME = "Apple";
    public static final String SOFTWARE = "IOS";
    //can only make constants or static methods in interface. just showing here 2 different ways to do the same thing.

    void turnON(); //public abstract method

    public static void getBrand(){
        System.out.println("Apple");
    }
}

class Runner2 {

    public static void main(String[] args) {

        Mac.getBrand();
        System.out.println(Mac.NAME);
        System.out.println(Mac.SOFTWARE);

    }
}
