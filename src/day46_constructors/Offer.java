package day46_constructors;

import java.security.PublicKey;

public class Offer {

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public Offer (String location, String company, double salary, boolean isFullTime, int numberOfPTO){
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public Offer (String company, double salary, boolean isFullTime){
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
    //2nd offer method will work improperly since we need to have an ifstatement in here saying if its not used to not show up as null. check next day for reference.

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTO=" + numberOfPTO +
                '}';
    }

}
