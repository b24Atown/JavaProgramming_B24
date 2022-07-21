package day25_loops;

public class BiggestSubstring {

    public static void main(String[] args) {

        /*
        given a string find the biggest substring of chars that match and print it.
        ex: aaabbbcccccddddee
        output ccccc
         */
        String str = "aaabbbcccccddddee";
        String other = ""; // stiring the next iteration and it gets reset everytime
        String biggest = ""; //storing the longest iteration

        for (int i = 0;i<str.length()-1;i++) { //-1 here since were checking plus 1 in the if statement

            other+= str.charAt(i);

            if(str.charAt(i) != str.charAt(i+1)){ //action is done here when the car is not the same as the one next to it.
                if (other.length()>biggest.length()){
                    biggest = other;
                }

                other = ""; //checked all the as above and now we need to check the other letters


            }

        }
        System.out.println(biggest);

    }
}
