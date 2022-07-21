package practice_problems;

public class ContainsPractice {

    public static void main(String[] args) {


        String word = "Hello";
        String vowels = "aeiou";
        String result ="";

        for (int i = 0; i < word.length(); i++) {

            if(vowels.contains(""+ word.charAt(i))){
                result+= word.charAt(i);
            }

        }
        System.out.println(result);
    }
}
