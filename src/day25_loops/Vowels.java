package day25_loops;

public class Vowels {

    public static void main(String[] args) {

        String s = "java is great";
        int count = 0;
        String vowels = "aeiou";
        for(int i = 0; i< s.length();i++){
            if (vowels.contains(s.substring(i, i+1))){ // so were looking at character of 0,1 which means just the character at 0.
                count++;

            }
            //could also do it like this
            //if(vowels.contains("" + s.charAt(i)))    this will concantenate it so char can be evaluagted.
        }
        System.out.println(count + "vowels");


        /*
        could have also done it like this
        // if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || etc....
        //count++
         */

    }
}



