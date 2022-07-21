package practice_problems;

public class Five {

    public static void main(String[] args) {

        //Q5: String -- Reverse
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String word = "ABCD";
        String reverse ="";

        for (int i = word.length()-1; i>=0;i--){
            reverse+= word.charAt(i);
        }
        System.out.println(reverse);

    }
}
