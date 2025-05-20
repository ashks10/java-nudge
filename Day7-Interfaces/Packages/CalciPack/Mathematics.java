package CalciPack;

class Calculator{
    public void calulate(int a, int b){
        System.out.println("Your result is : " + a+b);
    }
}
class ScCalculator{
    public void calulate(int a, int b){
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}

class HybridCalculator{
    public void calulate(int a, int b){
        System.out.println("Your result is : " + (a+b));
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}

public class Mathematics{
    public static void main(String[] args){
        System.out.println("I am main method");
    }
}