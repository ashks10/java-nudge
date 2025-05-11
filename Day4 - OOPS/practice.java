import java.util.Scanner;

class Employeework{
    int salary;

    public int getSalary(){
        return salary;
    }

    String name;

    public String getName(){
        return name;
    }

    public void Printnasa(){
        System.out.println("My name is "+ name);
        System.out.println("My salary is "+ salary);
    }

    public void setName(String n){
        name = n;
    }
 }

class Cellphone{

    public void ringing(){
        System.out.println("Ringing...");
    }

    public void vibrating(){
        System.out.println("Vibrating...");
    }

    public void silent(){
        System.out.println("Silent...");
    }
}

public class practice {
    public static void main(String[] args) {

        //problem 1
        System.out.println("Welcome to Employee Portal");
        Employeework ashish = new Employeework();
        ashish.setName("Ashish kumar singh");
        ashish.salary = 93898;
        System.out.println(ashish.getSalary());
        System.out.println(ashish.getName());

        //problem 2
        Cellphone iphone = new Cellphone();
        iphone.ringing();
        iphone.vibrating();
        iphone.silent();
    }
}
