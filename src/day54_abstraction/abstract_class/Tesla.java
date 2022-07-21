package day54_abstraction.abstract_class;

public class Tesla extends ElectricCar{
    //so tesla class is child of electricCar, which is abstract class, but electriccar is also child of car which is also abstract class so tesla needs to implement all methods from grandparent and parent. Easiest way to do it is just generate methods.

    @Override
    public void start(){
        System.out.println("Use card to start");
    }

    @Override
    public void charge(){
        System.out.println("plugged in ...charging");
    }
}
