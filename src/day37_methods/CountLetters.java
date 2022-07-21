package day37_methods;

public class CountLetters {

    /*
    String, letter
    how many times is the letter in the string
    ex   apple, p  ->2
     */


    public static void main(String[] args) {
        System.out.println(frequencyOfLetter("apple", 'p'));
        System.out.println(frequencyOfLetter("java", 'j'));

        System.out.println(getDuplicateCharacters("applel"));
        System.out.println(getDuplicateChars("applel"));


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

            if(!allDuplicate.contains("" + str.charAt(i))) {

                int count = frequencyOfLetter(str, str.charAt(i));

                if (count > 1) {
                    allDuplicate += str.charAt(i);
                }
            }

        }
        return allDuplicate;
    }
//2nd way to do it
    public static String getDuplicateChars(String strng) {
        String dups = "";
        for (int i = 0; i < strng.length(); i++) {
            if (!dups.contains("" + strng.charAt(i))) {
                int count = 0;
                for (int j = 0; j < strng.length(); j++) {
                    if (strng.charAt(i) == strng.charAt(j)) {
                        count++;
                    }

                }
                if (count > 1) {
                    dups += strng.charAt(i);
                }
            }
        }
        return dups;
    }




}
