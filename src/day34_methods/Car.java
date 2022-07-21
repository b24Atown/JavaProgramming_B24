package day34_methods;

public class Car {

    /*
    Algorithm to start a car

    Unlock and open the door
    Get into the car and close the door
    Put seatbelt on
    Check mirrors
    Start car
    Put into drive and press gas pedal
     */

    public static void unlockAndOpenDoor(){
        System.out.println("Unlock and open the door");

    }//inside of these brackets is refered to as method body. we can do any code in there

    public static void GetIntoCarAndCloseDooor(){
        System.out.println("Get into the car and close door");
    }

    public static void putSeatbeltOn(){
        System.out.println("Put seatbelt on");
    }
    public static void checkMirrors(){
        System.out.println("Checking the left mirror");
        System.out.println("Checking the right mirror");
        System.out.println("Checking the rear view mirror");
    }
    public static void startCar(){
        System.out.println("Put in key and turn to start it");
    }
    public static void drive(){
        System.out.println("Pit into drive and press gas pedal");
    }
    public static void driveInAHurry(){
        unlockAndOpenDoor();
        GetIntoCarAndCloseDooor();
        startCar();
        drive();
    }

    public static void main(String[] args) {
        unlockAndOpenDoor();
        GetIntoCarAndCloseDooor();
        putSeatbeltOn();
        checkMirrors();
        startCar();
        drive();
        System.out.println("-----------");
        driveInAHurry();
    }
}
