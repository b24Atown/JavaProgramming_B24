package office_hours.practice_10_10_2021;

public class LiveShow extends Entertainment{

    String location;

    public LiveShow(String company, String location){
        super("LiveShow",company);
        this.location=location;
    }
}
