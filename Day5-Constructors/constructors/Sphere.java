class MySphere{
    private float radius;
    private float height;

    public MySphere(float Myradius , float Myheight){
        radius = Myradius;
        height = Myheight;
    }

    public void setRadius(float r){
        radius = r;
    }
    public float getRadius(){
        return radius;
    }

    public void setHeight(float h){
        height = h;
    }
    public float getHeight(){
        return height;
    }

    public double getVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
public class Sphere {
    public static void main(String[] args) {
        MySphere sphere = new MySphere(4,5);

        System.out.println(sphere.getHeight());
        System.out.println(sphere.getRadius());
        System.out.println(sphere.getSurfaceArea());
        System.out.println(sphere.getVolume());
    }
}
