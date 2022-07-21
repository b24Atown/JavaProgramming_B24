package office_hours.practice_10_08_2021;

public class Store {

    public static void main(String[] args) {

        WaterBottle bottle = new WaterBottle("Dasani",3.3);
        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());

        bottle.setOunces(5.5);
        bottle.setBrand("ice mountain");
        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());
        bottle.setBrand(null);
        System.out.println(bottle.getBrand());
    }
}
