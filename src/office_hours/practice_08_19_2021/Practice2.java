package office_hours.practice_08_19_2021;

public class Practice2 {
    public static void main(String[] args) {


        String word = "vwxyz";
        String all1 = "";
        String all2 = "";
        String all3 = "";
        String all4 = "";
        String all5 = "";

        for (int i = word.length()-1; i>=0;i--){

            all1+= "" + word.charAt(4) + word.charAt(i) + "\n";
            all2 += ""+ word.charAt(3) + word.charAt(i) + "\n";
            all3 += ""+ word.charAt(2) + word.charAt(i) + "\n";
            all4 += ""+ word.charAt(1) + word.charAt(i) + "\n";
            all5 += ""+ word.charAt(0) + word.charAt(i) + "\n";



            }
        String all = all1 + all2 + all3 + all4 + all5;
        System.out.println(all.substring(0,all.length()-1));

        }

    }
