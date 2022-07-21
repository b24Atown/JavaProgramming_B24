package day26_unit2recap;

import java.util.Scanner;

public class HTMLGenerator {

    public static void main(String[] args) {

        /*
        given a string in the following format take the number part of the generator the html tags
        ex
        input: div^2
        output: <div></div> <div>/div>

        ex input:
        li^3
        output: <li></li><li></li><li><li/li>

                 */
        Scanner input = new Scanner(System.in);
        System.out.println("What html tag do you want to generate");
        String str = input.nextLine();  //li^3

        String tag = str.substring(0,str.indexOf("^"));

        int indexOfCarrot = str.indexOf("^");
        String strNum = str.substring((indexOfCarrot+1));
        System.out.println(strNum);
        //this code turns a number in String format to a number type
        int num = Integer.parseInt(strNum);

        String html = "";

        for (int i = 0; i<num; i++){
            html+= "<" + tag + ">" + "</" + tag + ">";
        }
        System.out.println(html);

    }
}
