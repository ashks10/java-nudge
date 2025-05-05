import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1. Write a program to take two integers and print their sum, difference, and product.

                Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter number 1?");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter number 2?");
                    int num2 =scanner.nextInt();

                        int sum = num1 + num2 ;
                        System.out.println(sum);

                        int diff = num1 - num2;
                        System.out.println(diff);

                        int prod = num1 * num2;
                        System.out.println(prod);



        // 2. Convert temperature from Celsius to Fahrenheit.

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the value in Degree Cels.");
                double degree = scanner.nextDouble();

                    double fahren = 9/5f * degree + 32.0;
                    System.out.printf("%.2f",fahren);



        // 3. Swap two numbers without using a third variable.

                int age1 = 4;
                int age2 = 6;

                age1 = age1 ^ age2;
                age2 = age1 ^ age2;
                age1 = age1 ^ age2;

                System.out.print("a = "+age1+" b = "+age2);



        // 4. Input a float and cast it to an integer manually, then print both.

                float num = 10.34f;
                int casting = (int) num;
                System.out.println(casting);



        // 5. Demonstrate implicit and explicit type casting with at least 3 examples.

                // byte -> short -> int -> long -> float -> double    #automatic (implicit)    #manual(Explicit)
                int a =  5;
                double b = a;
                System.out.println(b);

                float d = 34.564f;
                int explicit = (int) d;
                System.out.println(d);



        // 6. Write a program to evaluate the expression: ((a + b) * c) / d with user input.

                Scanner scanner = new Scanner(System.in);
                System.out.println("a?");
                int a = scanner.nextInt();
                System.out.println("b?");
                int b = scanner.nextInt();
                System.out.println("c?");
                int c = scanner.nextInt();
                System.out.println("d?");
                int d = scanner.nextInt();

                float exp =  ((a+b) *c) /(float)d;
                System.out.println(exp);



        // 7. Use increment (++) and decrement (--) operators in a small calculation and print steps.

                int a = 4;

                for (int i=0 ; i < 2 ; i++){
                    if(i == 0){
                    for (int j=a ; j >= 0 ; j--) {
                        System.out.print(j);
                        }
                    }else {
                        for (int j=0 ; j<=a; j++){
                            System.out.print(j);
                        }
                    }
                    System.out.println();
                }



        // 8. Check if a string is a palindrome.

                Scanner scanner = new Scanner(System.in);
                System.out.println("What was it ?");
                String name = scanner.nextLine();
                String reversed = "";

                for(int i = name.length()-1; i>=0 ; i--){
                    reversed += name.charAt(i);
                }

                if (name.equals(reversed)){
                    System.out.println("palindrome");
                }else{
                    System.out.println("Not a palindrome");
                }


    }

}