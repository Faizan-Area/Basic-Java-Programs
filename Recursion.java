import java.util.Scanner;

public class Recursion {

    public static void table(int n, int i, int j) {
        if (i > j) {
            return;
        }
        System.out.println(n + " * " + i + " = " + (n * i));
        table(n, i + 1, j);
    }

    public static void sum(int n, int sum, int end) {

        if (n == end) {
            System.out.println("Sum of first 20 numbers = " + sum);
            return;
        }

        sum += n;
        // System.out.println("Sum of first 20 numbers = " + sum);
        sum(n + 1, sum, end);
    }

    public static void fact(int num, int fact) {
        if (num == 0) {
            System.out.println("Factorial of " + num + " = " + 1);
            return;
        } else if (num == 1) {
            System.out.println("Factorial of given no. = " + fact);
            return;
        }

        fact *= num;
        fact(num - 1, fact);
    }

    public static void fibo(int num, int t1, int t2) {
        if (num == 0) {
            return;
        }

        System.out.print(t1 + " ");

        int temp = t1 + t2;
        t1 = t2;
        t2 = temp;

        fibo(num - 1, t1, t2);
    }

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * calcPower(x, n - 1);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number = ");
            int num = sc.nextInt();
            // int t1 = 0;
            // int t2 = 1;
            // System.out.print("Enter the start number = ");
            // int start = sc.nextInt();
            System.out.print("Enter the end number = ");
            int end = sc.nextInt();
            // int sum = 0;
            // int fact = 1;

            // table(num, start, end);
            // sum(start, sum, end);
            // fact(num, fact);
            // fibo(num, t1, t2);
            System.out.println(num + " ^ " + end + " = " + calcPower(num, end));

        }

    }
}