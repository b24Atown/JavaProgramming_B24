package practice_problems;

import java.util.Arrays;

public class SixVersTwo {

     /*
  Q6: String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
   */

    public static String SortLettersAndNumbers(String str) {
        String two = "";

        for (int i = 0; i < str.length(); i++) {
            two += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                two += ",";
            } else if (Character.isDigit(str.charAt(i)) && i < str.length() - 1 && Character.isAlphabetic(str.charAt(i + 1))) {
                two += ",";
            }
        }
        String[] arr = two.split(",");
        str = "";

        for (int i = 0; i < arr.length; i++) {
            char[] characters = arr[i].toCharArray();
            Arrays.sort(characters);
            for (int j = 0; j < characters.length; j++) {
                str += "" + characters[j];
            }

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(SortLettersAndNumbers("DC501GCCCA098911"));
    }
}
