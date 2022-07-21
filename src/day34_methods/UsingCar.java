package day34_methods;

public class UsingCar {

    public static void main(String[] args) {

        Car.driveInAHurry(); //since were in the same package we dont need to import and can just call the method

        System.out.println("Hear police siren");

        Car.putSeatbeltOn();
        Car.checkMirrors();
    }
}
