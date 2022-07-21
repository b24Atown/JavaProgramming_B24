package day05_variables;

public class CarDriverInfo {

    public static void main(String[] args) {

        String carModel = "Toyota";
        String driverName = "Ardit";
        String licenseNum = "M4K2G9";
        short speed = 100;
        boolean isAutomatic = true;
        char licenseClass = 'G';

        System.out.println("\t\t\tCar Info");
        System.out.println("Model: " + carModel);
        System.out.println("Driver: " + driverName);
        System.out.println("License #: " + licenseNum);
        System.out.println("Max Speed: " + speed + "km/h" + "\n");
        System.out.println("\t\t\tFeatures:");
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("License needed: " + licenseClass);


    }
}
