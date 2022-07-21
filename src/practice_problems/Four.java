package practice_problems;

public class Four {

    //Q4: String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {

        String word = "AAABBBCCCDEF";
        String result = "";

        for(int i = 0; i<word.length();i++){
            int count = 0;
            for (int j = 0; j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                result+= word.charAt(i);
            }
        }
        System.out.println(result);

        String [] arr = {"hello", "my","name","is", "hello","my","name" };
        String word2 = "";
        String word4 = "";
        for(int i = 0;i<arr.length;i++){
           int counter = 0;
           for(int j = 0; j< arr.length;j++){
               if(arr[j].equals(arr[i])){
                   counter++;
               }
           }
           if(counter == 1){
               word2 = arr[i];
           }
           if(counter>1 && !word4.contains(arr[i])){
               word4 += arr[i] + " ";
           }
        }
        System.out.println(word2); //unique
        System.out.println(word4); //nonunique


    }
}
