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

        /* 5. Write a simple calculator using switch with +, -, *, /.

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

        /* 6. Count digits of a given number using a loop.

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

        /* 7. check weather an givene integer is present in the array or not.

                float[] marks = {45.12f, 64.152f ,78.65f, 48.23f, 98.24f};
                float num = 78f;
                boolean isInArray = false;

                for (float element:marks){
                    if(num==element){
                        isInArray = true;
                        break;
                    }
                }
                if (isInArray){
                    System.out.println("the value is present in the array");
                }else {
                    System.out.println("the value is not present in the array");
                }

                */

        /* 8. average marks from an array using for-each loop.

                double[] marks = {65.5 , 72.3 , 85.45 , 98.45, 78.35 , 45.65 , 72.96};
                double average = 0;

                for (double element: marks){
                    average += element;
                }
                System.out.println(average/(marks.length));

                 */

        /* 9. java program to add two matrices of size 2 x 3. (2-D Array)

                int[][] mat1 = {{2 ,5 ,8} ,
                                {3,4,6} };
                int[][] mat2 = {{4,7,5} ,
                                {1,8,6}};
                int[][] result = {{0,0,0},
                                {0,0,0}};

                for (int i = 0; i< mat1.length ; i++){
                    for (int j=0 ; j< mat1[i].length ; j++){
                        result[i][j] = mat1[i][j] + mat2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println("");
                }

                */

        /* 10. Reverse an array

                int[] num = {45 , 78 ,65,48, 32,75 ,87};

        //method 1
                //        for (int i= num.length -1 ; i >= 0 ; i --){
                //          System.out.print(num[i] + " ");
                //       }

        //method 2
                int l = num.length;
                int n = Math.floorDiv(1,2);
                int temp;

                for (int i=0 ; i<=n; i++){
                    temp = num[i];
                    num[i] = num[l-i-1];
                    num[l-i-1] = temp;
                }
                for (int element: num){
                    System.out.println(element + " ");
                }

                */

        /* 11. Maximum element of an array

                int[] arr = { 45 , 87 ,12 , 98 , 35 };
                int max = 0;

                for (int element: arr){
                    if(element>max){
                        max = element;
                    }
                }
                System.out.println(max);

                */

        /*12. Minimum element of an array

                int[] arr = { 45 , 87 ,12 , 98 , 35 };
                int min = Integer.MAX_VALUE;

                for (int element: arr){
                    if(element<min){
                        min = element;
                    }
                }
                System.out.println(min);

                 */

        /* 13. Array sorted or not.


                boolean isSorted = true;
                int[] arr = {1,2,3,4,5,6,7};
                for (int i=0 ; i< arr.length -1; i++){
                    if(arr[i] > arr[i +1]){
                        isSorted = false;
                        break;
                    }
                }
                if (isSorted){
                    System.out.println("array is sorted");
                }else {
                    System.out.println("array is not sorted");
                }

                 */

        /* 14. Reverse a number using a while loop.

                int num = 123456;
                int reversed = 0;

                while(num != 0){
                    int digit = num %10;
                    reversed = reversed * 10 + digit;
                    num = num / 10;
                }
                System.out.println(reversed);

                */

        /* 15. Check whether a number is a prime or not.

            int num = 29;
            boolean isPrime = true;

            if (num <= 1){
                isPrime=false;
            }else {
                for (int i = 2 ; i <= Math.sqrt(num) ; i++){
                    if (num%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println("prime number");
                }else {
                    System.out.println("not a prime number");
                }
            }

            */

    }
}








