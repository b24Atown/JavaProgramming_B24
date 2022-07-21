package my_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringUtil {
    /*
    Reverse method
    It will accept the string parameter and return the reverse version of the string
     */
    public static String reverse(String original) {
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }
    /*
    Method will accept the string and return a string in proper format
    first character as uppercase and the rest as lowercase
     */

    public static String fixCaseFormat(String original) {
        return original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
    }

    /*
  this method will count how many times a certain letter is in the given string.
  returns the counter value
   */
    public static int frequencyOfLetter(String word, char letter) {

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;
    }
    /*
    String "applel". return a string of characters that is duplicate in your string
    return-> "pl"
     */

    public static String getDuplicateCharacters(String str) {
        String allDuplicate = "";
        for (int i = 0; i < str.length(); i++) {

            if(!allDuplicate.contains(""+str.charAt(i))) {// If allduplicate doesnt contain the character, this keeps checking. if it does contain the character, then this becomes false so it doesnt run. so you only get one of the dups

                int count = frequencyOfLetter(str, str.charAt(i));

                if (count > 1) {
                    allDuplicate += str.charAt(i);
                }
            }

        }
        return allDuplicate;

    }

    public static String countEachLetter(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        String result = "";

        for (String each : list) {
            if (!result.contains(each)) {
                int count = Collections.frequency(list, each);
                result += each + count;
            }

        }
        return result;
    }
}
