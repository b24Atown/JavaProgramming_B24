package office_hours.practice_08_18_2021;

import java.util.Arrays;

public class Asaf {

    public static void main(String[] args) {
        int[] inhabitants = {3,6,0,4,3,2,7,0};
        System.out.println("Day 0" + Arrays.toString(inhabitants));
        int count=0;
        for (int i = 0; i < inhabitants.length; i++) {

            for (int j = 0; j < inhabitants.length; j++) {
                if(inhabitants[j]==0 && j!=0 && j!=inhabitants.length-1) {
                    inhabitants[j-1]=inhabitants[j-1]/2;
                    inhabitants[j+1]=inhabitants[j+1]/2;
                }else if(j==0&&inhabitants[j]==0){
                    inhabitants[j+1]=inhabitants[j+1]/2;
                }else if(j== inhabitants.length-1 &&inhabitants[inhabitants.length-1]==0){
                    inhabitants[inhabitants.length-2]=inhabitants[inhabitants.length-2]/2;
                }

            }
            System.out.println("Day "+ (i+1) +" "+Arrays.toString(inhabitants));
            int population=0;
            for(int k=0;k< inhabitants.length;k++){
                population+=inhabitants[k];
            }
            if(population==0){
                System.out.println("----EXTINCT----");
                break;
            }
        }
    }
}
