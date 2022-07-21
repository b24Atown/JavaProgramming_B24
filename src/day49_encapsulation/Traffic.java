package day49_encapsulation;

public class Traffic {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");
        System.out.println(light.color);//this would'nt be able to access the private color

        light.color = "brown";  //this means that were changing the instance variable at the trafficlight class to brown. this is not proper ussage. Thats why we need encapsulation. we dont wanna have direct access to light and be able to change that. we should only be changing for this instance.

        System.out.println(light.getColor());
        light.setColor("green");
        System.out.println(light.getColor());

        light.setColor("brown");
        System.out.println(light.getColor());
        //there is no brown in my set color method so it will stay as green.

    }
}
