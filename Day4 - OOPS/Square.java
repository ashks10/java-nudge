class Property{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

public class Square {
    public static void main(String[] args) {
        Property prop = new Property();

        prop.side = 5;
        System.out.println(prop.side);
        System.out.println(prop.area());
        System.out.println(prop.perimeter());

    }
}
