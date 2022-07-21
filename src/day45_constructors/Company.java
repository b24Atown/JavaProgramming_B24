package day45_constructors;

import java.util.Arrays;

public class Company {

    public static void main(String[] args) {

        Employee one = new Employee("James Bond", 7,"agent",1_000_000);
        System.out.println(one);
        one.goToMeeting();

        Employee [] staff = new Employee[3];
        staff[0] = one;
        staff[1] = new Employee("Ardit", 44, "Sdet", 150_000 );


        System.out.println(Arrays.toString(staff));
    }
}
