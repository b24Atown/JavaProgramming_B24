package day20_string;

public class ReplaceMethod {
    public static void main(String[] args) {

        String word = "java";
        word = word.replace('a', 'e');
        System.out.println(word);

        String word2 = "softskils";
        System.out.println(word2.replace('s', 'x'));

        String msg = "   Hello today is Sunday";
        System.out.println(msg.replace(" ", ""));
    }
}
