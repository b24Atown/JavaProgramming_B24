package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Friends {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("How many friends do you want to enter");
        String [] friendList = new String[input.nextInt()];

        for(int i = 0; i<friendList.length;i++){
            System.out.println("Enter friend " + (i+1)); //+1 so when we print it says friend 1, instead of starting at friend 0
            friendList[i] = input.next();
        }
        System.out.println(Arrays.toString(friendList));
    }
}
