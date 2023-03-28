import java.util.Scanner;

public class Functions {

    public static void primeOrNot(int num) {
        int prime = 1;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 0) {
            System.out.println("This number is not prime");
        } else {
            System.out.println("This number is prime");
        }
        return;
    }

    public static void fibonacciSeries() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number to print fibonacci series = ");
            int n = sc.nextInt();

            int t1 = 0, t2 = 1, nextTerm;

            for (int i = 1; i <= n; i++) {
                System.out.print(t1 + " ");
                nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;
            }
        }
        return;
    }

    public static void gcd() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number to print Greatest Common Divisor = ");
            // int n = sc.nextInt();

        }
        return;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number for Checking prime or not = ");
            int n = sc.nextInt();
            primeOrNot(n);
            fibonacciSeries();
            gcd();
        }
    }

}
