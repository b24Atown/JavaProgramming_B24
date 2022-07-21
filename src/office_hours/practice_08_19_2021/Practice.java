package office_hours.practice_08_19_2021;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //print letters from a-z

        char letter = 'a';

        while(letter<='z'){
            System.out.print(letter + ", ");
            letter++;
        }

        char letter2 = 'Z';
        while (letter2>='A'){
            System.out.print(letter2-- + ", ");
        }

        int num = 12;

        while(num<=16){
            System.out.println(num++ + ", ");
        }
        int num2 = 15;
        while(num2>=10){
            num2--;
            System.out.print(num2 + ", ");
        }

        int number1 = 1;
        while(number1++<=20){
            System.out.println("number" + number1);
        }
        int sum2 = 0;
        boolean positiveNumber = true;
        while(positiveNumber){
            System.out.println("enter a number");
            int number2 = input.nextInt();
            if(number2>0){
                sum2+= number2;
            }else {
                positiveNumber=false;
            }


        }
        System.out.println("sum2: " + sum2);



        //multiplication table
        int count = 3;
        for(int i =0; i<11;i++){
            System.out.println(count * i);
        }
        //palindrome
        String word = "racecar";
        String reverses = "";

        for (int i = word.length()-1; i>=0;i--){
            reverses+= word.charAt(i);
        }
        System.out.println(reverses);
        if (reverses.equals(word)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

        //check how many times a letter is in a word/
        String checking = "ahahaha";
        int counter = 0;
        for(int i = 0; i<checking.length();i++){
            if(checking.charAt(i)=='h'){
                counter++;
            }
        }
      String hi = "ahiahiahiaaa";
        int howmany = 0;
        for(int i = 0; i<hi.length()-1;i++){
            if (hi.charAt(i)=='h' && hi.charAt(i+1)=='i'){
                howmany++;
            }
        }
        System.out.println(howmany + " amount of his");

        String liz = "the brown fox jumped over the cant remember the rest of the sentence";
        int lizzy = 1;
        for(int i = 0; i<liz.length();i++){
            if(liz.charAt(i)==' '){
                lizzy ++;
            }
        }
        System.out.println(lizzy + " many words in the sentence");

        String liz2 = "hola";
        for(int i = 0; i<liz2.length();i++){
            System.out.println((int)liz2.charAt(i));
        }

        String liz3 = "hIH23409EWJFEwkefe";
        int o = 0;
        int n = 0;
        int e = 0;
        for(int i = 0; i<liz3.length();i++){
            if(liz3.charAt(i)>='a' && liz3.charAt(i)<='z'){
                o++;
            }
            if(liz3.charAt(i)>='A'&& liz3.charAt(i)<='Z'){
                n++;
            }
            if (liz3.charAt(i)>='0' && liz3.charAt(i)<='9'){
                e++;
            }
        }
        System.out.println(o + ":lowercase " + n + ":uppercase " + e + ":numbers");

        String lizzyB = "abcabc";
        String container = "";
        for(int i = 0; i<lizzyB.length();i++){
            if(!container.contains(""+lizzyB.charAt(i))){
                container += lizzyB.charAt(i);

            }
        }
        System.out.println(container);

        String ard = "aaabbbcccccdddee";
        String longe = "";
        String longer = "";
        for(int i = 0; i<ard.length()-1;i++) {
            longe+=ard.charAt(i);
            if (ard.charAt(i) != ard.charAt(i + 1)) {
                if(longe.length()>longer.length()){
                    longer = longe;
                }
                longe = "";


            }

        }
        System.out.println(longer);

        String ardit = "ja-va-ba";
        int ark = 1;
        for(int i = 0; i<ardit.length();i++){
            if(ardit.substring(i,i+1).contains("-")){
                ark++;
            }
        }
        System.out.println(ark++);




    }
}
