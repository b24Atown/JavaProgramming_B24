package day58_exceptions.animal;

import day54_abstraction.hiding.A;

public class Panda extends Animal{

    @Override
    public Panda getAnimal(){
        return new Panda();
    }
}
