package day52_inheritance.computer;

public class Computer {

    String os;
    int memory;

    public Computer(String os, int memory){
        this.os= os;
        this.memory= memory;
    }

    @Override
    public String toString() { //overriding toString method.
        return "OS: " + os + " Memory : " + memory;
    }

}
