package day15_switch;

import org.junit.jupiter.api.Test;

public class Break {
    public static void main(String[] args) {

        int i = 9;
        switch (i){
            //int i = 9()switch finds the case. so in this case it comes to 9. then after that it runs top to bottom. so it will run everything after that. So even though we only matched case 9, it still runs everything after 9. thats why you need the code break. so it no longer runs down the chain. again youre only trying to find a specific case and run that command.
            case 8:
                System.out.println(8);
            case 9:
                System.out.println(9);
            case 10:
                System.out.println(10);
                break;

//  if you change int to 1  now. 1 will print, so will  2 and then stop there because of the break. the default means if nothing matches, then default will run.



            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            default:
                System.out.println("default");
        }
    }
}
