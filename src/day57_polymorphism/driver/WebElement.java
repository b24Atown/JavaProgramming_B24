package day57_polymorphism.driver;


public interface WebElement {

    void sendKeys(String txt);

    void click();

    String getText();

    //no need to put public or abstract cuz interface implies it.
}
