public class Except {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }catch (Exception e){
            System.out.print("The program will not run due to : ");
            System.out.println(e);
        }
    }
}
