package day33_multidimensional_array;

import java.util.Arrays;

public class StringMultiArray {

    public static void main(String[] args) {

        String [][] cybertek = new String[4][];//4 single arrays in the 2d array. if you were to assign a number to the second part it would be the same thing as saying you have 4 arrays with each ex 2 length.


        String [] groupOne = {"Sergii","Nisso","Rano"};
        String [] groupTwo = {"Mubarek","Ibrahim"};
        String [] groupThree = {"Nadir", "Saim"};
        String [] groupFour = {"Nicole","Tach","Ailya","Mohammed"};

        cybertek[0] = groupOne;
        cybertek[1] = groupTwo;
        cybertek[2] = groupThree;
        cybertek[3] = groupFour;

        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));//shows 4 null elements (arrays)

        System.out.println("FOR LOOP");

        for(String [] groups: cybertek){
            System.out.println(Arrays.toString(groups)); //prints each individual element seperately
            System.out.println("Group members: " );

            for(String member:groups){
                System.out.println(member);
            }

        }

    }
}
