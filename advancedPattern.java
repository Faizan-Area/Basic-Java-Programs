import java.util.Scanner;

public class advancedPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("No. of Row = ");
            int n = sc.nextInt();
            // System.out.print("No. of Colums = ");
            // int m = sc.nextInt();

            // Butterfly
            System.out.println("Butterfly");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Solid Rohmbus
            System.out.println("Solid Rohmbus");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Number Pyramid
            System.out.println("Number Pyramid");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            // Palindromic Pattern
            System.out.println("Palindromic Pattern");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            // Diamond Pattern
            System.out.println("Diamond Pattern");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}