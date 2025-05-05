import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1. Concatenate two strings manually using a loop (no .concat()).

                Scanner scanner = new Scanner(System.in);
                System.out.println("First String?");
                String first = scanner.nextLine();
                System.out.println("Second string?");
                String last = scanner.nextLine();

                char[] chars1 = first.toCharArray();
                char[] chars2 = last.toCharArray();

                char[] result = new char[chars1.length + chars2.length];

                for(int i =0 ; i<chars1.length ; i++){
                    result[i] = chars1[i];
                }

                for(int i=0 ; i< chars2.length ; i++){
                    result[chars1.length + i] = chars2[i];
                }

                String concatenated = new String(result);
                System.out.println(concatenated);

                 */

        /* 2. Count vowels in a given string.

                Scanner scanner =new Scanner(System.in);
                System.out.println("What is your name?");
                String vowel = scanner.nextLine();

                int count = 0;

                for (int i = 0 ; i < vowel.length() ; i++){
                    char ch =Character.toLowerCase(vowel.charAt(i));
                    if (ch =='a' || i=='e'|| ch =='i' || i=='o' || i=='u'){
                        count++;
                    }
                }
                System.out.println(count);

                   */


        /* 3. Check if a number is positive, negative, or zero.

                Scanner scanner =new Scanner(System.in);
                System.out.println("Whats the number?");
                int number = scanner.nextInt();

                if (number>0){
                    System.out.println("positivve");
                } else if (number<0) {
                    System.out.println("negativee");
                }else {
                    System.out.println("zero");
                }

         */

        /* 4. Take marks for 3 subjects and print pass/fail using average.

                Scanner scanner =new Scanner(System.in);
                System.out.println("Whats the mark1?");
                double mark1 = scanner.nextDouble();
                System.out.println("Whats the marks2?");
                double mark2 = scanner.nextDouble();
                System.out.println("Whats the marks3?");
                double mark3 = scanner.nextDouble();

                double sum = (mark1 + mark2 + mark3);
                double average = sum / 300f * 100;
                System.out.printf("%.2f",average);
                System.out.println("");

                if (average>=40){
                    System.out.println("pass");
                } else if (average<40) {
                    System.out.println("fail");
                } else {
                        System.out.println("invalid");
                    }

         */

        /*Write a simple calculator using switch with +, -, *, /.

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the first number ?");
                double num1 = scanner.nextDouble();

                System.out.println("Enter operator ( + - * /)");
                char ch = scanner.next().charAt(0);

                System.out.println("enter the second number ?");
                double num2 = scanner.nextDouble();

                double result;

                switch(ch){
                    case '+'-> { result= num1 + num2 ;System.out.println(result);}
                    case '-'-> { result= num1 - num2 ;System.out.println(result);}
                    case '*'-> { result = num1 * num2;System.out.println(result);}
                    case '/' -> {
                        if (num2 != 0){ result = num1/num2;System.out.println(result);}
                        else {
                            System.out.println("indivisible");
                        }
                    }
                    default -> System.out.println("invalid");
                }

         */




        //Print the first n Fibonacci numbers.

        //Print a pattern of stars in a pyramid shape.

        /*Count digits of a given number using a loop.

                Scanner scanner = new Scanner(System.in);
                System.out.println("What is the number?");
                int volvo = scanner.nextInt();
                int count = 0;

                if (volvo == 0){
                    count = 1;
                }else {
                    while(volvo != 0){
                        volvo=volvo/10;
                        count++;
                    }

                System.out.println(count);

                }

         */

        //Reverse a number using a while loop.

        //Find the GCD (Greatest Common Divisor) of two numbers using Euclidean algorithm.

        //Check whether a number is a prime or not.



    }
}








