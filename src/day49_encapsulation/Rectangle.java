package day49_encapsulation;

public class Rectangle {
//practice. make encapsulated methods height and width. make constructor with both variables. make methood to calculate area. make get and set for both width and height.
    private int height;
    private int width;

    public Rectangle(int height, int width){ //added layer of the set and get so that no invalid data will be used when the constructor is called.
        setHeight(height);
        setWidth(width);
    }

    public int calculateArea(){
        return height * width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        if(height>0) {
            this.height = height;
        }
    }
    public int getWidth(){
         return width;
    }
    public void setWidth(int width){
        if(width>0) {
            this.width = width;
        }
    }


}
