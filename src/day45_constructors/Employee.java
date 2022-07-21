package day45_constructors;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String inputName,int inputId,String inputJobTitle,double inputSalary){
        name = inputName;
        id = inputId;
        jobTitle = inputJobTitle;
        salary = inputSalary;
    }

    public void goToMeeting(){

        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", jobTitle: '" + jobTitle + '\'' +
                ", salary: " + salary +
                '}';
    }
}
