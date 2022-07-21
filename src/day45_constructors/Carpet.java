package day45_constructors;

public class Carpet {

    /*
    width, length, unit price, if its persian, total price
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice,boolean inputIsPersian){
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;
        totalPrice = width * length * unitPrice;
        if(isPersian){
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

