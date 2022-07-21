package day47_constructors;

public class Phone2 {

    String name;
    String brand;
    double version;
    int memory;

    public Phone2(String name){
        this.name = name;
    }

    public Phone2 (String name, String brand){ //overload1
        this(name);
        this.brand = brand;
    }

    public Phone2 (String name, String brand, double version){ //overload2
        this(name,brand);
        this.version = version;
    }
    public Phone2 (String name, String brand, double version, int memory){// ov3
        this(name,brand,version);
        this.memory = memory;
    }

    //first you call instance variable with this. then overload 1 - this() calls first method. and then call instance variable brand. overload 2- flow would be this() would call overload 1 then this.version gets called. and so on.
}
