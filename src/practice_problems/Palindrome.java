package practice_problems;

public class Palindrome {

    public static void main(String[] args) {

        String word = "raceaaaacr";
        String result = "";

        for(int i = 0; i<word.length();i++){
            result+= word.charAt(word.length()-1-i);
        }
        System.out.println(result);
        System.out.println(result==word);
        //better way
boolean pal = true;
        for(int i =0; i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                pal = false;
                break;
            }
        }
        System.out.println(pal);

        //checking for palindrome and storing each palindrome.

        String [] arr = {"java", "longer word", "civic", "apple","racecar","mom","anna"};
        String p = "";
        for (String each: arr){
            boolean palindrome = true;
            for(int i = 0; i<each.length()/2;i++){
                if(each.charAt(i) != each.charAt(each.length()-1)){
                    palindrome = false;
                    break;

                }else {
                    p+= each + " ";
                }
            }
        }
        System.out.println(p);


        //checking for longest palindrome and printing that one

        String longest = "";
        for(String each: arr){
            boolean ispal = true;
            for(int i = 0; i<each.length()/2;i++){
                if(each.charAt(i) != each.charAt(each.length()-1-i)){
                    ispal = false;
                    break;
                }
            }
            if(ispal && each.length()>longest.length()){
                longest= each;
            }
        }
        System.out.println(longest);
    }
}
