package day56_polymorphism.transportation;

public class Tesla extends Car implements SelfDriveable, Electric{

    int a;

    @Override
    public void go() {
        System.out.println("Tesla - Tesla is driving");
    }


    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is in auto pilot");
    }

}
