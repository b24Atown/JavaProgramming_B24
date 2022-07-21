package day11_if_statements;

public class IfPractice {

    public static void main(String[] args) {

        double hourlyRate = 10.5;
        double hoursWorked = 45;
        double netPay;

        String message;

        if(hoursWorked > 40) {

            //overtime calculation

            double overTimeHours = hoursWorked - 40;
            netPay = 40 * hourlyRate; //this is base pay
            netPay += overTimeHours * hourlyRate * 1.5;

            message = "Wow you worked " + hoursWorked + " hours so you got paid for " +overTimeHours + " hours overtime, so your total net pay is: " + netPay;

        } else {
            netPay = hoursWorked * hourlyRate;
            message = "Wow you worked " + hoursWorked + " your total net pay is: " + netPay;

        }

        System.out.println(message);//this needs to be outside the brackets so one of the two messages prints.
        //if the first if statement is true, the first boolean code will run. otherwise it will go to the else and run that. if there is another else (multi branch if statements) then the very last code will run even if no condition is met.

    }
}
