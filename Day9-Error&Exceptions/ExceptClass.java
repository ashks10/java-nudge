import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";   //super.toString();
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";    //super.getMessage();
    }
}

public class ExceptClass {
    public static void main(String[] args) {
        int a ;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a<99){
            try {
               // throw new MyException();
                throw new ArithmeticException("This is an exeception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
        System.out.println("Yes Finished");
    }
}



// creating your own exception class

//        class MaxAgeException extends Exception{
//            @Override
//            public String toString() {
//                return "the age cannot be greater than 125";   //super.toString();
//            }
//
//            @Override
//            public String getMessage() {
//                return "make sure the age entered is correct";    //super.getMessage();
//            }
//        }
