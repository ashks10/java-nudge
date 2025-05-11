class Employee{
    int id;
    int salary;
    String name;
    public void PrintDetails(){
        System.out.println("My id is "+ id);
        System.out.println("And my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Oriented {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee ashish = new Employee(); //instantiating a new Employee object
        Employee john = new Employee();
        //setting attributes
        ashish.id = 12;
        ashish.name = "Ashish kumar singh";
        ashish.salary = 98201;
        john.id = 17;
        john.name = "John deepseek";
        john.salary = 42656;
        //printing properties or attributes
        ashish.PrintDetails();
        john.PrintDetails();
        int salary = ashish.getSalary();
        System.out.println(ashish.salary);
        //System.out.println(ashish.id);
        //System.out.println(ashish.name);
    }
}
