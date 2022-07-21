package day57_polymorphism.driver;

public class Google {

    public static void main(String[] args) {

        WebElement elem1 = new Link();

        WebElement elem2 = new Input();




        WebDriverUtil.clickElement(elem1);

        WebDriverUtil.clickElement(elem2);
        //we can use link or input because we setup in the method that anything that implements webelement can be given in the parameter. so we can use link or input because they implement webelement.
    }
}
