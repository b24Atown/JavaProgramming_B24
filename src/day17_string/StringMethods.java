package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james"));//true
        System.out.println(name.equals("James"));//false

        System.out.println(name.equalsIgnoreCase("JaMeS")); //true
        //this ignores case sensitivity.

        System.out.println(name.toUpperCase()); ///makes the name variable to all uppercase

        System.out.println(name);//but string did not change. it just made that one instance into all uppercase
        String lastName = "bond";
        lastName.toUpperCase();
        System.out.println(lastName);
        //even though line 17 we changed it to uppercase. we never used it so it stayed the same
        lastName = lastName.toUpperCase();
        System.out.println(lastName);
        //now we are referencing to the new value so string will show as all uppercase
        System.out.println(lastName.toLowerCase());//bond
        System.out.println(lastName);//Still BOND since it hasnt been reassigned.

        String word = "Monday";
        int a = word.length();
        System.out.println(a);
        //checks how many letters are in the string variable. spase sensitive so will show a character for a space as well.
    }
}
