package day54_abstraction.abstract_class;

public class Toyota extends Car {

    @Override //when overriding get rid of abstract keyword
    public void start(){
        System.out.println("Insert key");
        System.out.println("Turn key");
    }
}
