package day25_loops;

public class CountThings {

    public static void main(String[] args) {

        /*
        Given a String, find and print how many uppercase letters, lowercase letters, and numbers are in the String
        ex:
        Input: 2juMp41EEkd4s4
        output: 3 uppercase letters
                6 lowercase letters
                5 numbers
         */
        String word = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i<word.length();i++){

            char eachChar = word.charAt(i); // dont need to do this step just helps us call it quicker.

            if(eachChar >=  'A' && eachChar <= 'Z'){
                upper++;

            }else if (eachChar>= 'a' && eachChar <= 'z'){
                lower++;

            }else if (eachChar>='0' && eachChar <= '9'){
                number++;

            }
        }
        System.out.println("there are " + upper + " uppercase letters " + "\n \t \t\t" + lower + " lowercase letters \n \t\t\t" + number + " numbers.");
    }
}
