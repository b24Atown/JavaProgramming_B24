package day18_strings;

public class Title {

    /*
    Mr, Mrs, DR, Senior, Madam, Junior
     */

    public static void main(String[] args) {

        String name = "Dr James Jr";

        if(name.startsWith("Mr")) {
            System.out.println("Hello Mr");
        } else if (name.startsWith("Mrs")) {
            System.out.println("Hello Mrs");
        }else if (name.startsWith("Dr")){
            System.out.println("Hello doctor, what did you study?");
        }else if (name.startsWith("Madam")) {
            System.out.println("Hello Madam");
        }

        if(name.endsWith("Jr")){
            System.out.println("Hello junior");
        } else if (name.endsWith("Sr")){
            System.out.println("Hello senior");
        }


    }
}
