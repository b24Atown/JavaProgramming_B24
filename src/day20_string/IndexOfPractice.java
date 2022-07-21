package day20_string;

public class IndexOfPractice {
    public static void main(String[] args) {

        String word = "banana";

        int firstA = word.indexOf("a");//1
        int lastA = word.lastIndexOf("a");//5
       // int middleA = word.indexOf('a',2); //from 2 since we know first a is in position 1. this is also hard coded
        int middleA = word.indexOf('a', firstA + 1); //not hard coded way. were saying find a after the first a.
        //so then with this method. to find last a we would do
        //intlastA=word.indexOf('a', middleA +1);
        System.out.println(firstA);
        System.out.println(middleA);
        System.out.println(lastA);

        System.out.println("----------------------------------");
        String s = "001011010";
            //      012345678
        int posOne = s.indexOf('1');
        int posTwo = s.indexOf('1',posOne +1);
        int posThree = s.indexOf('1', posTwo +1);
        int posFour = s.indexOf('1',posThree + 1);

        System.out.println(posOne);
        System.out.println(posTwo);
        System.out.println(posThree);
        System.out.println((posFour));


    }
}
