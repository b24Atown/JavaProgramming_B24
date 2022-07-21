package day58_exceptions.animal;

public class PO extends Animal{

    @Override
    public PO getAnimal(){
        return new PO();
    }
}
