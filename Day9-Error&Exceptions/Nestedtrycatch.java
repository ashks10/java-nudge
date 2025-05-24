import java.util.Scanner;

public class Nestedtrycatch {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 45;
        marks[1]=65;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome back boss");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry the array is out of bound");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Excpetion in level 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}
