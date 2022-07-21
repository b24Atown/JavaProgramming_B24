package day11_if_statements;

public class CheckNumbers {

    public static void main(String[] args) {

        int numOne = 4;
        int numTwo = 6;

        if(numOne > numTwo) {
            System.out.println(numOne + " is bigger");
        } else {
            System.out.println(numTwo + " is bigger");
        }

        int year = 2021;

        if (year ==2020 || year == 2021) {
            System.out.println("in lockdown");
            System.out.println("stay at home");
            //if year is equal to 2020 or 2021, print the two statements. otherwise do nothing
        }

        char letter = 't';

        if (letter == 'E' || letter == 'e'){
            System.out.println("letter is e");

        } else {
            System.out.println(letter + " is not e");
        }
    }
}
