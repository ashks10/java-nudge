class MyEmployee{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Acces {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();

        emp.setName("Ashish kumar singh");
        System.out.println(emp.getName());
    }
}


