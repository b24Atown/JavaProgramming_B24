package day19_strings;

public class IndexOfExample {
    public static void main(String[] args) {

        //charAt takes a number(index) and gives back a char
        // inidexOf takes a char/String and gives back the position/index/numbere

        String s = "java";
        System.out.println(s.indexOf('j'));//0
        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('z'));//if your characterr is not in the strirng. it will give you a -1 by default
        //if you have multiple of a character, it will give you the position of the first one
        System.out.println(s.indexOf("ja"));//this gives 0 because the inxed started at postion 0
        System.out.println(s.indexOf("ava"));//gives 1 because thats where positioin of first at is
        System.out.println("Va");// -1 because its not in the string adn thats what it defaults to
        System.out.println("va");//2 since it starts on position 2.
    }
}
