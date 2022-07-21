package day57_polymorphism.driver;

import java.util.List;

public class Web {

    public static void main(String[] args) {

        // Ways to make link object

        //reference of itself and what methods it has access to.
        Link link1 = new Link();
        link1.sendKeys("Hello");
        link1.click();
        System.out.println(link1.getText());
        link1.getUrl();

        WebElement link2 = new Link();
        link2.sendKeys("Hello");
        link2.click();
        System.out.println(link2.getText());
        //link2.getUrl(); no access to geturl method since its only in Link reference. Even though implementation comes from object side, reference doesnt know what geturl method is so cant use it.

        Link [] allLinks = new Link[3];
        allLinks[0] = link1;
        //allLinks[1] = link2;
        //cant do the above because link

        WebElement [] web = new Link[3];
        web[0] = link1;
        web[1] = link2;

        WebElement [] elements = new WebElement[3];
        elements[0] = link1;
        elements[1] = link2;
        elements[2] = new Input();




    }
}
