package day49_encapsulation;

public class UseCar {

    public static void main(String[] args) {

        Car car = new Car("James", "LC007",40);
        System.out.println(car.driver);//we had toString in driver class so will print.
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);


        Car car2 = new Car("Adam", "238482", 35);
        System.out.println(car2.driver);
        System.out.println(car2);
    }
}
