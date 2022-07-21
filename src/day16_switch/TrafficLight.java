package day16_switch;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        boolean isGreen = true;
        String action = isGreen ? "go" : "stop";
        System.out.println(action);

        String name = "Nadir";
        String className = name.equals("Nadir")? "Soft skills" : "Java";
        //if classname is nadir. then its softskills. otherwise its java

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        String evenOrOdd = number %2 == 0 ? "even": "odd";
        System.out.println(evenOrOdd);

        System.out.println("Enter a number");
        double numberOne = input.nextDouble();
        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();

        double max = numberOne>numberTwo ? numberOne : numberTwo;



    }
}
