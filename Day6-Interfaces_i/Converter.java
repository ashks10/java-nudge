class Circle{
    public int radius;

    Circle(){
        System.out.println("I am non para of a circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am a cylinder parameterized constructor");
        this.height = h;
    }
    public double Volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Converter {
    public static void main(String[] args) {
        Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12,4);
        System.out.println(objC.area());
        System.out.println(obj.Volume());
    }
}
