package day19_strings;

public class MultipleIndexes {
    public static void main(String[] args) {

        String word = "definition";
        System.out.println(word.indexOf('i'));
        System.out.println(word.lastIndexOf('i'));
        // with what we learned so far. position of first i is 3 and last i is 7.

        int secondIHardCoded = word.indexOf('i', 4);
        //so it says looking for ch i and it looks from position 4. if you looked from 3 it would include the one in that place
        System.out.println(secondIHardCoded);

        int firstPos = word.indexOf('i');
        int secondPos = word.indexOf('i', firstPos + 1);
        //in this example it starts to look from position 4
        System.out.println(secondPos);
        int thirdPos = word.indexOf('i', secondPos + 1);
        System.out.println(thirdPos);

        System.out.println("--------------");

        String a = "ababa";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('a', a.indexOf('a') + 1));
        //so from first position, youre looking for the next occurrence.
        //much easier to hard code this because its easierr to read.



    }
}
