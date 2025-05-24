public class Akhri {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {   //will take no matter what
            System.out.println("Cleaning up resources...END of function");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a =7;
        int b=3;
        while(true){
            try{
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Iam finally the value of b : " + b) ;
            }
            b--;
        }

        try{
            //System.out.println(5/0);
            System.out.println(50/10);
        }
        finally {
            System.out.println("This will run without th catch methof no matter what");
        }
    }
}
