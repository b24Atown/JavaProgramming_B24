package day08_relational_logical_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        System.out.println("5 > 3:" + (5>3));

        System.out.println("5 < 3: " + (5<3));

        int a = 4;
        int b = 4;

        System.out.println("a>b: " + (a>b));
        System.out.println("a>=b: " + (a>=b));

        boolean checkAEqualToB = a==b; //this checks if a is equal to b
        System.out.println("a==b: " + checkAEqualToB);

        boolean checkANotEqualToB = a != b; //this checks if a is not equal to b
        System.out.println("a !=b: " + checkANotEqualToB);

        System.out.println("-----");
        boolean check = a>b;
        System.out.println(check);








    }
}
