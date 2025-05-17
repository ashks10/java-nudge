class MyRectangle{
    private int length;
    private int bredth;

    public MyRectangle(){
        this.length = 4;
        this.bredth = 5;
    }
    // constructor overloading
    public MyRectangle(int Mylength , int Mybredth){
        length = Mylength;
        bredth = Mybredth;
    }

    public void setLength(int l){
        this.length = l;
    }
    public int getLength(){
        return length;
    }
    public void setBredth(int b){
        this.bredth = b;
    }
    public int getBredth(){
        return bredth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        //MyRectangle rectangle = new MyRectangle();
        MyRectangle rectangle = new MyRectangle(4,6);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBredth());
    }
}
