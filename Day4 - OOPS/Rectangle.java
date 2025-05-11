
class Rproperty{
    int length;
    int bredth;

    public int area(){
        return length*bredth;
    }
    public int perimeter(){
        return 2*(length + bredth);
    }

}

public class Rectangle {
    public static void main(String[] args) {
        Rproperty prop = new Rproperty();

        prop.length = 5;
        prop.bredth = 4;

        System.out.println(prop.area());
        System.out.println(prop.perimeter());
    }
}
