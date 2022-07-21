package practice_problems;

import java.util.Arrays;

public class Six {

    public static void main(String[] args) {
        SortLettersAndNumbersFromString("C501GCCCA098911");
    }

  /*
  Q6: String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
   */
    //how to solve - you wanna make a container that will hold your rearranged string. So we will loop through each letter, and were also gonna print char at i first on the str2. now were making an if statement inside. if charat(i) is a letter,

    public static void SortLettersAndNumbersFromString(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                }
            }
        }

        String[] arr = str2.split(",");
        str = "";
        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        System.out.println(str);

    }
}