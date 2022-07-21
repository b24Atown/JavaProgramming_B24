package day54_abstraction.person;

public class WorkPlace {

    public static void main(String[] args) {

       // Person person = new Person(); cant create an object of person because it is abstract class.

      //  Employee employee = new Employee(); also invalid because it is an abstract class.

        Tester tester  = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";

        System.out.println();

        Developer developer = new Developer();
        developer.work();
        developer.sleep(50);

        System.out.println();

        Chef chef = new Chef();
        chef.sleep(22);
        chef.work();


    }
}
