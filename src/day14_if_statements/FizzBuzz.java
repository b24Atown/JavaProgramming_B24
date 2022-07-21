package day14_if_statements;

public class FizzBuzz {
    public static void main(String[] args) {

        /*
        Evaluate your number and print based on the following:
        multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". for numbers which are multip;les of both three and five print "FizzBuzz". If the number is not divisible by any of those numbers print just the number
        EG. number = 6
        "FizzBuzz" --when number is dibisible by 3 and  5
        "Fizz"---div  by 3
        "Buzz"---div by 5
         */

        int num = 6;

/*    //order matters. if you try this. then it wont work. it will evaluate the first option and be right so it wont know if the one with fizzbuzz works. wont get to evaluate it
        if (num %3 == 0) {
            System.out.println("Fizz");

        } else if (num %5 ==0){
            System.out.println("Buzz");
        } else if (num %3 ==0 && num %5 == 0){
            System.out.println("fizzbuzz");
        }*/

        if (num %3 ==0 && num %5 == 0){
            System.out.println("fizzbuzz");
        } else if (num %5 ==0){
            System.out.println("Buzz");
        } else if (num %3 == 0){
            System.out.println("Fizz");
        }






        }
    }
