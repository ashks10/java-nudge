import java.util.Scanner;

public class Practice {
    public static class MaxRetrieveExtendsException extends Exception{
        @Override
        public String getMessage() {
            return "max retreive are reached";
        }
    }
    public static void main(String[] args) throws MaxRetrieveExtendsException {
        /* suntax error
                int a = 7;
                    b =5;
                System.out.println(b+a);
                */
                /*
                int a = 5 ;
                int b = 0;
                try{
                    int c = a/b;
                } catch (ArithmeticException e) {
                    System.out.println("HAHA ");
                }
                catch (IllegalArgumentException e) {
                    System.out.println("HEHE");
                }

                 */

        // keeps running till vALID INDEX IS GIVEN
        boolean flag = true;
        int [] arr = new int[5];
        arr[0] = 44;
        arr[1] = 17;
        arr[2] = 22;
        Scanner scanner = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("WHat is the index?");
                index = scanner.nextInt();
                System.out.println(arr[index]);
                break;
            }
            catch(Exception e){
                System.out.println("INvalid index");
                i++;
            }
        }
        if(i>=5){
            try{
                throw new MaxRetrieveExtendsException();
            }catch (MaxRetrieveExtendsException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
