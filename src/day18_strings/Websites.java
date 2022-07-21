package day18_strings;

import java.util.Scanner;

public class Websites {
    public static void main(String[] args) {

        //ask the user to type a website. check if website is valid
        //a website is valid if it begins wit www.
        // and at the end has .com, .edu, .gov, .net

        Scanner input = new Scanner(System.in);
        System.out.println("Type a website");
        String website = input.next();
        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (validStart && validEnd){
            System.out.println(website + " is valid");
        } else{
            if(!validStart){
                System.out.println("needs to begin with www.");
            }
            if (!validEnd){

                System.out.println("needs to end with \n.com\n.edu\n.gov\n.net");
            }

        }
    }
}
