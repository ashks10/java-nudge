class Cylinder{
    private double radius;
    private float height;

    public Cylinder(double myradius , float myheight){
        radius = myradius;
        height = myheight;
    }

    public Cylinder(){
        radius = 4;
        height = 8.5f;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float h){
        this.height = h;
    }

    public float Volume(){
        return (float)(3.14*(radius*radius)*height);
    }

    public float SurfaceArea(){
        return (float)(2*3.14*(radius*radius) + 2*3.14*radius*height);
    }
}

public class Practice {
    public static void main(String[] args) {
        //Cylinder cylinder = new Cylinder(2,4);

        Cylinder cylinder = new Cylinder();

        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.Volume());
        System.out.println(cylinder.SurfaceArea());
    }
}
