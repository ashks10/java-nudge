public class thrthrows {
    public static class NegativeRadiusException extends Exception{
       public String toString(){
           return "Radius cannot be negative";
       }
       public String getMessage(){
           return "Radius cannot be negative!!";
       }
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        float result = (float) (Math.PI*r*r);
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        //made by aashish
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //shivam - uses divides funstion created by ashish
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(4);
            System.out.println(ar);
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}
