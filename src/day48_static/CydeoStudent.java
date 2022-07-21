package day48_static;

public class CydeoStudent {

    String name;
    int id;
    int groupNumber;

    static int batchNumber;
    static String [] instructors;
    static String schoolName;

    static Coffee myCoffee;

    public CydeoStudent(String name, int id, int groupNumber){ //constructor helps us initialize instance variables.
        this.name = name;
        this.id = id;
        this.groupNumber = groupNumber;
    }

    static { //static block helps us initialize static variables
        batchNumber = 24;
        instructors = new String[] {"Nadir","Saim","Murodil"};
        schoolName = "Cydeo";
        myCoffee = new Coffee("Starbucks",10);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
