package practice_problems;

public class ArraySpace {

    public static void main(String[] args) {
        //return words that are double
        String words = "hello, how are, you, doing right, now";
        String [] arr = words.split(", ");


        for(String each: arr){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }
    //if you wanted you wanted to cover for a word that might be just a space then is statement should also say && !each.equals(" ")

    }
}
