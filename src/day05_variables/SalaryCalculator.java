package day05_variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
        SalaryCalculator

    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
         */

        double salary = 100_000;
        double stateTaxRate  = 0.08;
        double federalTaxRate = 0.21;

        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        System.out.println("With these values:");
        System.out.println("Salary: " + salary);
        System.out.println("State tax rate: " + stateTaxRate);
        System.out.println("Federal tax rate: " + federalTaxRate);

        System.out.println();

        System.out.println("Total tax amounts were: ");
        System.out.println("State tax: " + stateTax);
        System.out.println("Federal tax " + federalTax);
        System.out.println("Total tax " +totalTax);
        System.out.println("Salary after tax " + salaryAfterTax);



    }
}
