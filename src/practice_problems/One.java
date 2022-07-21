package practice_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class One {

    public static void main(String[] args) {

        //Q1: String -- Frequency of Characters
        //Write a return method that can find the frequency of characters Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String letters = "AAABBCDDA";
        String result = "";

        for (int i = 0; i < letters.length(); i++) {
            if (!result.contains("" + letters.charAt(i))) {
                int count = 0;
                for (int j = 0; j < letters.length(); j++) {
                    if (letters.charAt(i) == letters.charAt(j)) {
                        count++;
                    }
                }
                result += letters.charAt(i) + "" + count;
            }
        }
        System.out.println(result);

        System.out.println(freq("AXXXADDE"));

        System.out.println(fs(letters));
        System.out.println(":"+ fss(letters));


    }
    public static String freq (String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }
        }
        return result;
    }

    public static String fs(String str){
        String result = "";
        for (int i = 0; i<str.length();i++){
            int count = 0;
            for (int j = 0; j<str.length();j++){
                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            if (!result.contains(""+ str.charAt(i))){
                result+= str.charAt(i) +""+ count;
            }
        }
        return result;
    }
    public static String fss(String str){
        String result = "";
        for (char each : str.toCharArray()){
            int count = 0;
            for (char each1 : str.toCharArray()){
                if (each == each1){
                    count++;
                }
            }
            if (!result.contains(""+ each)){
                result+= each +""+ count;
            }
        }
        return result;
    }
}
