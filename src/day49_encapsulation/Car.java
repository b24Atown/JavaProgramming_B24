package day49_encapsulation;

public class Car {

    Driver driver; // right now just have a reference for driver class.

    public Car(String name, String licenseNumber, int age){
        driver = new Driver(name,licenseNumber,age); //took the driver reference and made a driver object. no need to say this.driver since driver isnt in the constructor soo its not needed.
    }

   //we wanna have 2 classes. one for driver and one for engine. just trying to show that you can have multiple classes in a file.
}

class Driver { //can't have it be called public cuz you can only have one public class in a file.
    String name;
    String licenseNumber;
    int age;

    public Driver(String name, String licenseNumber, int age){
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
