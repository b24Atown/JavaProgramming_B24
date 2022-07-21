package office_hours.oop;

import java.io.StringReader;

public class Tester {
    String name;
    int employeeId;
    String jobTitle;
    double salary;

    public Tester(String name, int employeeId){
        this.employeeId=employeeId;
        this.name=name;
    }

    public Tester(String name, int employeeId, String jobTitle, double salary){
        this(name,employeeId);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
