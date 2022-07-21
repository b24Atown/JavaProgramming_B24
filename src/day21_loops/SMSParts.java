package day21_loops;

public class SMSParts {

    public static void main(String[] args) {

        /*
        [SMS parts] Given a String in the following format:“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}” Separate these parts and print them separately: Sender: actualSenderNumber: actualNumberMessage: actualMessage”
         */

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
        String sender = message.substring((message.indexOf("<")+1), message.indexOf(">"));
        System.out.println(sender);
        //or
        int indexOfSenderBegins = message.indexOf('<');
        int indexOfSenderEnds = message.indexOf('>');
        String sender2 = message.substring(indexOfSenderBegins+1,indexOfSenderEnds);
        System.out.println(sender2);

    }
}
