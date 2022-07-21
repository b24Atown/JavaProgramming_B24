package day54_abstraction.mobile;

public class Phone {

    public static void main(String[] args) {

        MobileApp app1 = new MobileApp();
        app1.setName("Generic");
        app1.setVersion(0.1);
        app1.useApp(10);
        app1.download();

        System.out.println();

        Instagram app2 = new Instagram();
        app2.setName("Instagram");
        app2.setVersion(3.3);
        app2.download();
        app2.useApp(15);

        System.out.println();

        Discord app3 = new Discord();
        app3.setName("Discord");
        app3.setVersion(3.3);
        app3.download();
        app3.useApp(33);

    }
}
