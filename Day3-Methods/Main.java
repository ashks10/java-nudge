import java.util.Scanner;
public class Main {

    /* 1. multiplication table uing methods

            static void multiplication(int a){
            int n = a;
            for (int i = 1 ; i <= 10 ; i++){
                System.out.format("%d X %d = %d\n" ,n , i, n*i);
                }
            }

            public static void main(String[] args) {
            multiplication(5);

             */

    /* 2. recurssion learning ?

             static int logic(int x , int y){
                    int z ;
                    if(x>y){
                        z = x+y;
                    } else {
                        z = (x+y) * 5;
                    }
                    return z;
                }

            public static void main(String[] args) {

                int a = 5 ;
                int b = 7;
                int c ;

                //METHOD INVOCATION USING OBJECT CREATION when static is not there in the above method
        //            Main obj = new Main();
        //
        //            c = obj.logic(a,b);
                c=logic(a,b);
                int a1= 2;
                int b1 = 5;
                int c1;

        //        c1 = obj.logic(a1,b1);
                c1 = logic(a1,b1);
                System.out.println(c);
                System.out.println(c1);

                     */

    /* 4. print the star pattern;

            static void star(int a){
                for (int i = 0 ; i < a ; i++){
                    for (int j = 0 ; j < i+1 ;j++ ){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            public static void main(String[] args) {
                star (9);
            }

             */

    /* 5.  sum of n integer using methods
              static void add(int a){
                int sum = 0;
                for (int i = 0 ; i <= a ; i++){
                    sum += i;
                }
                System.out.println(sum);
            }

            public static void main(String[] args) {
                add(9);
            }

            */

    /* 6. recursive function to calcualate sum of n naautreal number and method based addition of n natural numbers
     static int add(int n){
                if(n==0){
                    return 0;
                }else {
                    return n + add(n-1);
                }
            }

            public static void main(String[] args) {
                System.out.println(add(10));
            }

             */

    /* 7. decending star pattern

            static void add(int a){
                for (int i = 1 ; i <= a ; i++ ){
                    for (int j = a-i+1 ; j > 0 ; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            public static void main(String[] args) {
                add(4);
            }

           // or using recursive function

                static void dec_rec(int a){
                    if (a>0){
                        dec_rec(a-1);
                        for (int i = 0 ; i < a ; i++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }

                public static void main(String[] args) {
                    dec_rec(4);
                }
                */

    /* 8. n terms in fibonacci series

    static int fib(int n){
        if( n <= 1){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write any number ?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }

     */

    /* 9. nth term in fibonnaci series

        static int fib(int n){
        //      if(n == 1){
        //         return 0;
        //      } else if (n==2) {
        //          return 1;
            if(n==1 || n==2){
                return n-1;
            }
            else {
                return fib(n-1) + fib (n-2);
            }
        }

        public static void main(String[] args) {
            System.out.println(fib(7));
        }

            */

    /* 10. funciton to find avg. of a set of numbers passed as arguments

        static float arr(int ...a){
            int sum = 0;
            for (int element: a){
                sum += element;
            }
            return (float) sum / a.length;
        }
        public static void main(String[] args) {
            System.out.println(arr(1,2,4));
            System.out.println(arr(4,5,6,7,5,8,9));
        }

        */

    /* 11. Print a pattern of stars in a pyramid shape.

        static void pyramid(int a) {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j < a - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            pyramid(5);
        }

     */

    /* 12. Find the GCD (Greatest Common Divisor) of two numbers using Euclidean algorithm.

    static int gcd(int a , int b){
//                while(b != 0){
//                    int temp = b;
//                    b = a%b;
//                    a = temp;
//                }
//                return a;
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int result = gcd(num1, num2);
        System.out.println("gcd of " + num1 + " and " + num2 + " is equal to " + result);
    }

     */


}

