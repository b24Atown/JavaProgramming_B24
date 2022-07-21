package day54_abstraction.mobile;

public class MobileApp {
    //setup class that had name and version encapsulated and setup an instance method to use.

   private String name;
   private double version;

   public void download(){
       System.out.println("Downloading version " + version + " of " + name);
   }

    public void useApp(int minutes){
        System.out.println("Using " + name + " for "+ minutes + " minutes");
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
