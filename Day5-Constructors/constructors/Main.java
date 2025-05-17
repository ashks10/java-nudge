class MyEmployee{

    private int id;
    private String name;
    private int salary;

    public MyEmployee(){    // method 1 overloading
        id = 45;
        name = "ASHISH KUMAR SINGH";
        salary = 94578;

    }
    public MyEmployee(int MySalary){
        salary = MySalary;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }

    public void setSalary(int s){
        this.salary = s;
    }

    public MyEmployee(String myName , int myId , int MySalary){  //method 2 overloading
        id = myId;
        name = myName;
        salary = MySalary;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

}

public class Main {
    public static void main(String[] args) {
        //MyEmployee emp = new MyEmployee("Ashish kumar singh" , 6078);
        MyEmployee emp = new MyEmployee(10000);

            //        emp.setId(45);
            //        emp.setName("ashish kumar singh");

//        System.out.println(emp.getName());
//        System.out.println(emp.getId());
        System.out.println(emp.getSalary());

    }
}

