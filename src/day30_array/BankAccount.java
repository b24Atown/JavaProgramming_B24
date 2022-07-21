package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        String array
       0 First name
       1 account number
       2 balance
       3 account type
            3 ways, declare info, without knowing info, and with scanner
         */
        String [] info1 = {"Ardit", "100","5000","Checking"};

        String [] info2 = new String[4]; //order you assign them doesnt matter. when you print them out later they will show up in correct order.
        info2[3] = "Saving";
        info2[2] = "10000";
        info2[1] = "101";
        info2[0] = "Ardit2";

        String [] info3 = new String[4];
        System.out.println("Enter your first name");
        info3[0] = input.next();
        System.out.println("Enter your account number");
        info3[1] = input.next();
        System.out.println("Enter your balance");
        info3[2] = input.next();
        System.out.println("Enter your account type");
        info3[3] = input.next();



        //dynamic scanner input with arrays

        String [] info4 = new String [4];
        String [] questions = {"first name","account number","balance","account type"};

        for(int i = 0; i<info4.length;i++){
            System.out.println("Enter your " + questions[i]);
            info4[i] = input.next();
        }


        System.out.println(Arrays.toString(info1));
        System.out.println(Arrays.toString(info2));
        System.out.println(Arrays.toString(info3));
        System.out.println(Arrays.toString(info4));








    }
}
