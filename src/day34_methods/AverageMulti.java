package day34_methods;

import java.util.Arrays;

public class AverageMulti {

    public static void main(String[] args) {

        int [][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,40,20}
        };
        //find and print the average of each inner array and the whole 2d array

        int total = 0;
        double totalNumbers = 0;


        for(int []eachGroup:nums){//this loop goes through the 2d nums array
            double sum = 0; //putting variable here means it will be set back to 0 every time the outer loop runs
            for (int eachNumber:eachGroup){//this loop goes through the 1d arrays
               sum+= eachNumber;
            }
            System.out.println("Average of " + Arrays.toString(eachGroup)+ " is: " + (sum/eachGroup.length));
            total+= sum;
            totalNumbers+=eachGroup.length;

        }
        System.out.println("Total: "+ total);
        System.out.println("Total average:"+ total/totalNumbers);



    }
}
