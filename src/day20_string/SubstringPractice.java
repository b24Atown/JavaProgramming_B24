package day20_string;

public class SubstringPractice {

    public static void main(String[] args) {

        String word = "abcdefghi";
                    // 012345678

        System.out.println(word.substring(4));//efghi
        System.out.println(word.substring(6));//ghi

        System.out.println(word.substring(4,6));//ef
        System.out.println(word.substring(4,7));//efg

        System.out.println();

    }
}
