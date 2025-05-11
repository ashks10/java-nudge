
class Propriority{

    int diameter;

    public int radius(){
        return diameter/2;
    }

    public double area(){
        return 3.14*(float)(radius()*radius());
    }
}

public class Circle {
    public static void main(String[] args) {
        Propriority prio = new Propriority();

        prio.diameter = 5;
        System.out.println(prio.radius());
        System.out.println(prio.area());

    }
}
