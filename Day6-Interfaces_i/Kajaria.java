class Rectangle{
        private double width;
        private double length;


        public Rectangle(int w , int l){
            System.out.println("This is a rectangle constructor");
            this.width = w;
            this.length = l;
        }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
            return length*width;
        }

}

class Cuboid extends Rectangle{

        private double height;

        Cuboid(int w , int h , int l){
            super(l,w);
            System.out.println("This is a subclass of rectangle extended by the cuboid");
            this.height = h;
        }
        public Cuboid(int l , int w){
            super(w , l);
            System.out.println("overloading");
            this.height = 0;
        }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
            //overriding the getarea of parent class
            return 2*(getLength()*getWidth()  + getWidth()*getHeight() + getHeight()*getLength());
        }

        public double getVolume(){
            return height*super.getArea();
        }
}

public class Kajaria {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10,6);
        System.out.println(obj.getArea());

        Cuboid objC = new Cuboid(4 ,5,6);
        System.out.println("Surface area of cuboid :" + objC.getArea());
        System.out.println("Volume of cuboid : " + objC.getVolume());
    }
}
