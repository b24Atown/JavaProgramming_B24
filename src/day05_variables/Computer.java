package day05_variables;

import java.time.chrono.MinguoChronology;

public class Computer {

    public static void main(String[] args) {

        String brand =  "Apple";
        String processor = "intel I5";
        byte ramMemory = 16;
        int storageMemory = 256;
        boolean hasMonitor = true;
        boolean hasWifi = true;
        String description = "This computer is capable of...";
        double price = 1500.99;
        String cpu = "A14";
        String color = "Silver";
        byte numberOfMonitors = 1;
        byte numberOfUsbSlots = 4;
        boolean hasUsb3 = true;

        System.out.println("\t\t\tComputer Specs" + "\n");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ramMemory + "MB");
        System.out.println("Storage: " + storageMemory);
        System.out.println("CPU: " + cpu);
        System.out.println("USB Slots: " + numberOfUsbSlots);
        System.out.println("Monitors: " + numberOfMonitors + "\n");
        System.out.println("\t\t\tExtras");
        System.out.println("Has Monitor: " + hasMonitor);
        System.out.println("Has Wifi: " + hasWifi);
        System.out.println("Has USB: " + hasUsb3 + "\n");
        System.out.println("\t\t\tProduct Description" + "\n");
        System.out.println(description);




    }
}
