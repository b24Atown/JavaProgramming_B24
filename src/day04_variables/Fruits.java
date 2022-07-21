package day04_variables;

public class Fruits {

    public static void main(String[] args) {

        int apples =10;
        int grapes = 15;
        int bananas =20;

        System.out.println("number of apples:" + apples);
        System.out.println("number of grapes:" + grapes);
        System.out.println("number of bananas:" + bananas);

        int totalNumberOfFruits = apples + grapes + bananas;
        System.out.println("total number of fruits: " + totalNumberOfFruits);

       //soutv shortcut for print variables

        apples = 50;

        //when reassigning value of variable dont put int before

        System.out.println("number of apples:" + apples);
        System.out.println("number of grapes:" + grapes);
        System.out.println("number of bananas:" + bananas);
        System.out.println("total number of fruits: " + totalNumberOfFruits);

        // command comes as same number even though apple was reassigned. we need to reassign totalNumberOfFruits
        // again for it to work properly
        totalNumberOfFruits = apples + grapes + bananas;
        System.out.println("number of apples:" + apples);
        System.out.println("number of grapes:" + grapes);
        System.out.println("number of bananas:" + bananas);
        System.out.println("total number of fruits: " + totalNumberOfFruits);





    }
}
