package day09_scanner_logical;

import java.util.Scanner;

public class ScannerObject {

    public static void main(String[] args) {

    //this is the object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a byte number: ");
        byte numberOne = input.nextByte();
        System.out.println(numberOne);
        System.out.println(numberOne + 1);
//you need click run then enter the number in the console. this will do the calculatioin on there.


    }
}
