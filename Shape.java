// coding task 2

public class Shape {
    public String name;
    public int rad;
    public int base;
    public int height;
    public double length;
    public double width;
    public double area;
    public void setParameters(String name, int rad) {
        this.name = name;
        this.rad = rad;
        area=3.1416*rad*rad;
    }
    public void setParameters(String name, int base, int height) {
        this.name = name;
        this.base = base;
        this.height = height;
        area=0.5*base*height;
    }
    public void setParameters(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        area=length*width;
    }
    public String details(){
        return "Shape Name: " + name + "\n" + "Area: " + area;
    }
}
