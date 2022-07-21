package day56_polymorphism.transportation;

public class Road {

    public static void main(String[] args) {


        Transportation car1 = new Transportation();
        car1.go();

        System.out.println();

        Car car2 = new Car();
        car2.go();
        car2.openTrunk();

        System.out.println();

        Transportation car3 = new Car();
        car3.go();
        //car3.openTrunk(); this wouldnt work because even though the implementation happens from the object side(so from car), transportation reference doesnt know what openTrunk method is so it wont work.

        Tesla t1 = new Tesla();
        Car t2 = new Tesla();
        Transportation t3 = new Tesla();
        SelfDriveable t4 = new Tesla();
        Electric t5 = new Tesla();
        

    }
}
