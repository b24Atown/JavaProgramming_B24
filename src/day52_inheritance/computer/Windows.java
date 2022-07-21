package day52_inheritance.computer;

public class Windows extends Computer {

    public Windows(String os, int memory){
        super(os, memory); // this is calling the computer constructor
    }
    //alternative way to do it would be this because this way we dont have to keep assigning windows as the os everytime we make a new object.
//    public Windows(int memory){
//        super("Windows", memory);
//    }
//if there is a constructor in computer class then there needs to be one here too because the file cant compile otherwise. the default constructor if not given would be
    //public Windows(){
    // super()
    // }
}
