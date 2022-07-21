package day11_if_statements;

public class IfExamples {

    public static void main(String[] args) {

        if(true) {
            System.out.println("Hello world");
// if (if statement) is  true, it will execute whatever is in-between the two curly brackets. you would use just an if statement when you wanna print something when one condition is met and dont care to look for another.
        }

        if(false) {
            System.out.println("Hello world 2");
        }

        int score = 30;

        if (score > 60) {
            System.out.println("you passed");
            //
        }

        if ( score <= 60) {
            System.out.println("you failed");
//iit will only print the one that meets the condition hence you failed prints and you passed doesnt
        }

        if (score > 60) {
            System.out.println("you passed");
        } else {
            System.out.println("you failed");
        }
        //this statement says if the first condition isn't met, then whatever is in the second condition will print.

    }
}
