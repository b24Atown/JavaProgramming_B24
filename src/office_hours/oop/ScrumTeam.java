package office_hours.oop;


import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    String productOwner;
    String scrumMaster;
    int sprintNumber;
    ArrayList<Developer> developers;
    ArrayList<Tester> testers;
    static String companyName;
    static String ceo;

    public ScrumTeam(int sprintNumber) {
        this.sprintNumber = sprintNumber;
        developers = new ArrayList<>();
        testers = new ArrayList<>();
    }

    public ScrumTeam(String productOwner, String scrumMaster, int sprintNumber) {
        this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer [] developer){
        developers.addAll(Arrays.asList(developer));
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester [] tester){
        testers.addAll(Arrays.asList(tester));
    }

    public void removeTester(int employeeId){
        testers.removeIf(each -> each.employeeId == employeeId);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner='" + productOwner + '\'' +
                ", scrumMaster='" + scrumMaster + '\'' +
                ", sprintNumber=" + sprintNumber +
                ", \ndevelopers=" + developers +
                ", \ntesters=" + testers +
                '}';
    }
}
