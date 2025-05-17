class Phone{
    public void greet() {
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("My phone is about to turen on");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("AApk swagat hai");
    }
    public void on(){
        System.out.println("My smartphone is turning on ...");
    }
}

public class Mainn {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone smobj = new Smartphone();
        //obj.name();

        Phone obj = new Smartphone();

        obj.greet();
        obj.on();
    }
}
