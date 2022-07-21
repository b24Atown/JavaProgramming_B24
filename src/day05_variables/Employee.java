package day05_variables;

public class Employee {

    public static void main(String[] args) {

        String firstName = "Ardit";
        String lastName = "Peni";
        String companyName = "UofA";
        double salary = 74000;
        int startDay = 20;
        String startMonth = "July";
        short startYear = 2021;
        boolean isFullTime = true;
        String jobTitle = "Research Coordinator";
        String officeAddress = "87 Avenue and 114 Street";

        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + " " + startDay + ", " + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salary3Year = (salary + (07 * 1000));

        System.out.println("\t\t\tEmployee Information" + "\n");
        System.out.println("Name: " + fullName);
        System.out.println("Start Date: " + fullStartDate);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary3Year);








    }
}
