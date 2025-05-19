abstract class pen{
    abstract void Write();
    abstract void refill();
}
class Pens extends pen{
    void Write(){
        System.out.println("This is butter smooth");
    }
    void refill(){
        System.out.println("OOPS you gotta refill");
    }











    void changeNib(){
        System.out.println("WE goottta change the nib buddy");
    }
}
public class Pentonic {
    public static void main(String[] args) {
        Pens ps = new Pens();
        ps.Write();
        ps.refill();
        ps.changeNib();
    }
}
