package office_hours.practice_10_11_2021;

public final class Iphone extends Phone implements Downloadable,AppleApp{

    public Iphone(String model, double price, int size){
        super("Iphone",model,price,size);
    }

    @Override
    public void facetime() {
        System.out.println("Iphone using facetime");
    }

    @Override
    public boolean download() {
        System.out.println("Downloading from " + APPSTORENAME);
        return true;
    }

    @Override
    public void calling() {
        System.out.println("Iphne is calling");
    }

    @Override
    public void texting() {
        System.out.println("Texting on iMessage");
    }
}
