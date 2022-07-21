package day13_if_statements;

public class StringCompare {

    public static void main(String[] args) {

        String city = "Chicago";

        if (city.equals("Virginia")) {
            System.out.println("City is Virginia");
        } else {
            System.out.println("city is not in Virginia");
        }

        if (city.equals("Chicago")) {
            System.out.println("The city is in Illinois");
        } else {
            System.out.println("City is not in Illinois");
        }
// asking is java equal to javascript. so the if statement will execute if its true. if its false then the else statement will print
        String str = "java";
        String str2 = "javascript";
        if (str.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
