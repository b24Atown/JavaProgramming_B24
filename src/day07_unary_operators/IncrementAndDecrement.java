package day07_unary_operators;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int n = 0;
        n++;
        System.out.println(n); //1. adds before so value of n becomes 1
        System.out.println(++n); //becomes 2 because the value of 1 gets added 1 before.

        System.out.println(n++); //prints 2, but n still increments after
        System.out.println(n);// prints 3 because now the increment has happened


        int age = 10;
        System.out.println(age); //age right now is 10
        System.out.println(age++);//10 since its incremented after
        System.out.println(age);//now its 11 because it has been incremented
        System.out.println(++age);//now its 12 because it has been incremented before
        System.out.println(age);//same value (12) since it already pre incremented line before
        System.out.println(age++ * 2);//will be 24 since age there is 12 x2.
        System.out.println(age); //the *2 doesnt store on age variable
        System.out.println(++age  + 2); //so 13incrermented to 14 + 2 equals 16
        System.out.println(age);//age is still 14













    }
}
