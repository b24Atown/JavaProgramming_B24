package day48_static;

import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {

        System.out.println("Batch: " + CydeoStudent.batchNumber);

        CydeoStudent studentOne = new CydeoStudent("James Bond",7,7);
        System.out.println(studentOne);

        CydeoStudent studentTwo = new CydeoStudent("Sherlock",8,10);
        System.out.println(studentTwo);

        System.out.println(studentOne.name + " and " + studentTwo.name + " have the following instructors: " + Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentOne.myCoffee.drink(2);
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        //since its static myCoffee  is static, everyone shares the same information of coffee. So doesnt matter who drinks coffee, total goes down.

       CydeoStudent studentTHree;


    }
}
