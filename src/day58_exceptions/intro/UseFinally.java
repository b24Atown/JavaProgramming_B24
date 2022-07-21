package day58_exceptions.intro;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class UseFinally {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = "";

        try{
            name = input.nextLine();

            System.out.println("Pick a character index");
            System.out.println(name.charAt(input.nextInt()));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("That was an invalid character, try again");
            System.out.println(name.charAt(input.nextInt()));
            //we said if it fails, try again.
        }finally {
            System.out.println("CLOSING STORE");
            //this will run even if we dont trip an exception.
            input.close();
        }
        //you enter a name, if you enter an int instead of string, we didnt code for that exception so code jumps to print finally block and close scanner.
        //2 you enter valid name, enter a valid number, no exception tripped, runs finally block as well
        //you enter a valid name, enter invalid index, exception gets tripped so runs catch block. asks you to enter index again. if it works no exception tripped and runs finally block. if it is invalid exception, finally block runs and you also get to see exception line at the end.
    }
}
