package office_hours.practice_10_12_2021;

public class Jacket extends Clothes implements HasHood{

    @Override
    public void wear() {
        System.out.println("Putting on jacket");
        putOnHood();
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on hood");
    }
}
