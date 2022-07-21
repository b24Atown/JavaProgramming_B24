package day58_exceptions.car;

import java.util.ArrayList;

public class DealerShip {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new BMW());
        cars.add(new Ford());
        cars.add(new Model3());
        cars.add(new Tesla());

        BMW car5 = new BMW();//this is same thing as uptop. just done in 2  steps.
        cars.add(car5);

        lease(car5);
        lease(new Model3());
        lease(new Ford());

        Ford ford = (Ford)getCar(3);//need to cast since car is reference
        Car car6 = getCar(1); // reference is itself. no need to cast
        BMW car7 = (BMW)getCar(1);//same as option 1

        BMW car8 = (BMW)car6;//need to cast to bmw


    }

    public static void lease(Car car){
        System.out.println("leasing  car");

    }

    public static Car getCar(int option){
        if(option==1){
            return new BMW();
        }else if(option==2){
            return new Tesla();
        }else if(option==3){
            return new Ford();
        }else {
            return new Model3();
        }
    }

}
