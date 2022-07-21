package day21_loops;

public class Alphabet {
    public static void main(String[] args) {

        //print letters from a -> z

        char letter = 'a';
        while(letter<='z'){
            System.out.print(letter++ + " ");
        }
        System.out.println();

        char letter2 = 'z';
        while (letter2>='a'){
            System.out.print(letter2-- + " ");
        }

        //while method.    char letter = 'a';
        //while(letter<= 'a')

        System.out.println();

        char num = '1';
        while(num <='9'){
            System.out.print(num++ + " ");
        }


    }
}
