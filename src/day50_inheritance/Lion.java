package day50_inheritance;

public class Lion extends Animal{

    int numberOfClaws;
    boolean king;
    //Lion has 5 instance variables. 3 from animal class and 2 from lion class. keep in mind were extending from animal class


    public void roar(){ //just making a method
        System.out.println("ROOOAR");
    }
}
