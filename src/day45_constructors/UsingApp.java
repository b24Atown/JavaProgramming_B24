package day45_constructors;

public class UsingApp {

    public static void main(String[] args) {

        App application = new App();

        application.name = "Ardit";
        application.version = 1.1;
        application.isFree = true;

        //calling update method

        application.update();

        //printing our information

        System.out.println(application.version);
        System.out.println(application.name);
        System.out.println(application.isFree ? "App is free" : "Paid app");;
    }
}
