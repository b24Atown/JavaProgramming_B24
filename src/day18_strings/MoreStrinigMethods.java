package day18_strings;

public class MoreStrinigMethods {
    public static void main(String[] args) {

        String s = "     Apples are   ";
        System.out.println(s.trim());

        String s3 = "";
        System.out.println(s3.isEmpty());
        //boolean value returned. checks if it is empty.

        String s4 = " ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.length());
        // fa;se since a space is a character

        String s5 = "javascript";
        System.out.println(s5.startsWith("java"));
        //checks if it starts with something and brrings a boolean value. this is true.
        System.out.println(s5.startsWith("Java"));
        //this is false since its uppercase.

        String s6 = "marker";
        System.out.println(s6.endsWith("rke"));
        //false because it doesnt contain the last letter.
        System.out.println(s6.endsWith("rker"));
        //this would be true


    }
}
