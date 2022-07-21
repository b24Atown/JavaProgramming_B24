package day18_strings;



public class RecapMethods {

    public static void main(String[] args) {

        String day = "thursDAY";

        boolean b = day.equals("Thursday");
        System.out.println(b);
        //false because the case is different.

        System.out.println(day.equalsIgnoreCase("Thursday"));
        //this will print true because it ignores cases.

        day.toUpperCase();
        System.out.println(day);
        //this will not print all uppercase because we didnt change the day variable. it would have only worked if we used it right away. we would need to reassign it. again reasiigning doesnt create new string. just changes reference of the string.

        day = day.toUpperCase();
        System.out.println(day);
        //now the reference of day is changed and was reassiigned. so it will print out all uppercase.

        System.out.println(day); //shows still upperase
        System.out.println(day.toLowerCase()); //this will change just this line to lowercase
        System.out.println(day);//back to uppercase which was the original value. iit wasnt reassigned so says at uppercase.

        System.out.println(day.length() + 1); //8 characters and one added so shows 9. because its an int variable so it will add it.

       // day = day.length; doesnt work because length method returns int and were trying to store into string.
        day = day.length() + ""; //this is int + string -> concatenation -> string type gets returned.
        System.out.println(day); // brings back the value 8 in string.
        System.out.println(day + 2); //shows as 82 which means its concantenation of the string variable 8 and 2. so "8" + 2 -> "82"





    }
}
