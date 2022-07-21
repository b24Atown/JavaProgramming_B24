package day08_relational_logical_operators;

public class AgeCheck {

    public static void main(String[] args) {

        int age = 2;
        boolean isAToddler = age <= 3;
        boolean isASenior = age>= 65;

        System.out.println("Is still a toddler: " + isAToddler);
        //if age was something bigger than 3 ex 5. output woiuld be false
        System.out.println("Is a senior: " + isASenior);
        //false because 2 is not bigger or equal to 65




    }
}
