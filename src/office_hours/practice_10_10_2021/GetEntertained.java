package office_hours.practice_10_10_2021;

public class GetEntertained {

    public static void main(String[] args) {

        NetflixShow netflix = new NetflixShow(60,"Breaking bad", 5,2);
        System.out.println(netflix.company);
        System.out.println(netflix.name);
        System.out.println(netflix.showName);

        KevinHart kevvin = new KevinHart("Chicago", "speecial", "11/01/2021");
    }
}
