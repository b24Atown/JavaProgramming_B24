package office_hours.oop;

public class Developer {

    String name;
    int employeeId;
    String jobTitle;
    double salary;
    static boolean canCode;

    static {
        canCode = true;
    }

    public Developer (int employeeId,String name){
        this.employeeId=employeeId;
        this.name=name;
    }

    public Developer (String name, int employeeId, String jobTitle, double salary){
        this(employeeId, name);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }



    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBug(){
        System.out.println(name + "fixing bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
