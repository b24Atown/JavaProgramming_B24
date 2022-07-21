package practice_problems;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class FrequencyOfChars {


    public static void main(String[] args) {
        String [] words = {"hello", "how","why","when"};
        char letter = 'e';
        System.out.println(charfreq(words,letter));


    }

    public static int charfreq(String [] words,char letter){
        int count = 0;
        for (String eachWord: words){
        //can also do char[] letters = eachWord.toCharArray();
            for (char eachLetter: eachWord.toCharArray()){
                if(eachLetter == letter){
                    count++;
                }
            }
        }
        return count;
    }
}
