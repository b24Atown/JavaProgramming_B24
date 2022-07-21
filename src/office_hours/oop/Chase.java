package office_hours.oop;

public class Chase {

    public static void main(String[] args) {

        ScrumTeam.ceo="J.P. Morgan";
        ScrumTeam.companyName = "Chase";

        ScrumTeam team = new ScrumTeam("Rashid","Mykata",4);
        System.out.println(team);

        Developer dev1 = new Developer("Ardit",5,"Senior Developer", 100000);

        team.addDeveloper(dev1);

        Developer dev2 = new Developer("Irina", 11,"Senior Developer",100000);

        team.addDeveloper(dev2);
        System.out.println(team);

        Tester test1 = new Tester("Ardit",7,"Sdet",100000);
        team.addTester(test1);

        System.out.println(team);
    }
}
