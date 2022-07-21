package office_hours.practice_08_18_2021;

import java.util.Arrays;

public class AnotherOne {

    public static void main(String[] args) {

        int[] inhabitants = new int[] { 10,5,0,0,4,7,6,2};


        System.out.println("Day 0 " +  Arrays.toString(inhabitants));

        for(int i = 0; i<inhabitants.length;i++){
            int count = 0;
            for(int j = 0;j<inhabitants.length;j++){
                if(inhabitants[j]==0 && j!=0 && j!= inhabitants.length-1){
                    inhabitants[j+1] = inhabitants[j+1]/2;
                    inhabitants[j-1] = inhabitants[j-1]/2;
                } else if(j==0 && inhabitants[j]==0){
                    inhabitants[j+1] = inhabitants[j+1]/2;
                }else if (j==inhabitants.length-1 && inhabitants[j]==0){
                    inhabitants[j-1] = inhabitants[j-1]/2;

                }
                if(inhabitants[j]==0){
                    count++;
                }
            }

            System.out.println("Day " + (i+1) + " "+ Arrays.toString(inhabitants));
            if (count == inhabitants.length){
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}


