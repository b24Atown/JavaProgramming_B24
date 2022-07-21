package day16_switch;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        double laptopPrice = 0;
        if (screenSize == 13.3){
            laptopPrice+=200;

        }else if (screenSize == 15.0){
            laptopPrice+=300;
        }else if (screenSize == 17.3){
            laptopPrice+=400;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();
        if (cpuType.equals("i3")){
            laptopPrice+=150;
        }else if (cpuType.equals("i5")){
            laptopPrice+=250;
        }else if (cpuType.equals("i7")){
            laptopPrice+=350;
        }

        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        switch (ramSize){
            case 4: laptopPrice+=50;
                break;
            case 8: laptopPrice+=100;
                break;
            case 12:laptopPrice+=150;
                break;
            case 16:laptopPrice+=200;
                break;
            case 20:laptopPrice+=250;
                break;
            case 24:laptopPrice+=300;
                break;
            case 28:laptopPrice+=350;
                break;
            case 32:laptopPrice+=400;

        }
        System.out.println("Select storage type:");
        String storageType = input.next();
        switch (storageType){
            case "SSD": laptopPrice+=100;
                break;
            case "HDD": laptopPrice+=50;

        }
        System.out.println("Enter memory size:");
        int memorySize = input.nextInt();


        System.out.println("Enter screen resolution:");
        String resolution = input.next();
        switch (resolution){
            case "FULLHD": laptopPrice+=100;
                break;
            case "4K": laptopPrice+=200;
        }

        System.out.println("Laptop price is: $" + laptopPrice);
    }
}

