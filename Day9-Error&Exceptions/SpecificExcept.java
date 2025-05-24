import java.util.Scanner;

public class SpecificExcept {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = scanner.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = scanner.nextInt();
        try {
            System.out.println("The value at array index : "+marks[ind]);
            System.out.println("The value of array-value/number : "+marks[ind]/number);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other excpetion has occured !!! ::");
            System.out.println(e);
        }
    }
}
