package Inheritance;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //if i want to call the base1(int a) the below will be used
        //super(0); //used to read the overloaded constructor the one with argument
        System.out.println("I am an derived class constructor");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("I am an overloaded constructor " + y);
    }
}

class childofderived extends Derived1{
    childofderived(){
        System.out.println("I am thge child of the derived constructor");
    }

    childofderived(int x , int y , int z) {
         super(x, y);
        System.out.println("I asma the overloaded constructor with the value of " +z);
     }
}

public class inheritance {
    public static void main(String[] args) {
        //Derived1 derive = new Derived1(15,9);
        childofderived child = new childofderived(15,45,32);

    }
}
