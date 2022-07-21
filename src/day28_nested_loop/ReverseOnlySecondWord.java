package day28_nested_loop;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {

        String word = "java is fun";
        String reverse = "";

        for (int i = 0; i<word.length();i++){

            if (word.charAt(i) == ' '){
                String reversed = "";

                for (int j = word.lastIndexOf(' '); j>=i;j--){
                    reversed+= word.charAt(j);

                }
                reverse+=reversed;
                i= word.lastIndexOf(' ');


            }else {
                reverse+=word.charAt(i);
            }

        }
        System.out.println(reverse);
    }
}
