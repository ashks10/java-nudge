package Inheritance;

class Base{
    int x;                                      // super class

        public int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println("Iam in base and setting X value");
            this.x = x;
        }

            public void printme(){
                System.out.println("Iam a constructor");
        }
}

class Derived extends Base{            // extends used in the inheritance to cces the superclass
    int y ;                             // subclass

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        //creating an object of base class
       Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());


        //creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(23);
        System.out.println(d.getY());
    }
}
