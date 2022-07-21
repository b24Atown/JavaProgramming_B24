package day56_polymorphism.learn_interface;

public interface CanTalk {

    //abstract method
    void speak();

    //first way to make non abstract method in interface
    public static void yell(){
        System.out.println("Yelling!!");
    }

    //second way to make non abstract method in interface
    public default void whisper(){
        System.out.println("Whispering shh");
    }

}
