package office_hours.practice_10_09_2021;

import java.nio.file.Files;
import java.util.ArrayList;

public class Module {

    ArrayList<File> files;

    public Module(){
        files = new ArrayList<>();
    }

    public Module(ArrayList<File> files){
        this();
        this.files.addAll(files);
    }
}
