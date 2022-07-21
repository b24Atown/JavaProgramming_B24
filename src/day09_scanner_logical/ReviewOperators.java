package day09_scanner_logical;

public class ReviewOperators {

    public static void main(String[] args) {

        double budget = 1000;

        budget -= 200;

        boolean stillInBudget = budget >= 0;

        System.out.println("budget after purchase: " + budget);
        System.out.println("Still in budget: " + stillInBudget);

        budget -=500;
        stillInBudget = budget >= 0; //we need to take that variable and keep updating it
        //in order to get thee right result

        System.out.println("budget after purchase: " + budget);
        System.out.println("Still in budget: " + stillInBudget);

        System.out.println(budget !=300); //checking if budget does not equal 300. brings back true or false
        System.out.println(budget !=300.5);

        System.out.println(budget-- ==300);//budget value will remain 300. and were checking if its equal to 300
        //after the value has been read though, the new value of budget is 299
        System.out.println(--budget == 299); //new value of budget is 298 so it will say false

        System.out.println(false == !true);//false= false means output is true
        System.out.println(false != true);//better way to check. because youre not changing a value and just checking if somethingi is not true



    }
}
