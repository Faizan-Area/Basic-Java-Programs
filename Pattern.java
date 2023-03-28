import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("No. of Row = ");
            int n = sc.nextInt();
            System.out.print("No. of Colums = ");
            int m = sc.nextInt();

            // Solid Rectangle
            System.out.println("Solid Rectangle");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Hollow Recatangle
            System.out.println("Hollow Rectangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == 1 || j == 1 || i == n || j == m) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            // Half Pyramid
            System.out.println("Half Pryramid");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Half Inverted Pyramid
            System.out.println("Half Inverted Pyramid");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Left Half Pyramid
            System.out.println("Left Half Pyramid");
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Left Half Inverted Pyramid
            System.out.println("Left Half Pyramid");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Half Pyramid with Numbers
            System.out.println("Half Pyramid with Numbers");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            
            // Half Inverted Pyramid with Numbers
            System.out.println("Half Inverted Pyramid with Numbers");
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            // Floyd's Triangle
            System.out.println("Floyd's Triangle");
            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
            
            // 0 or 1 Triangle
            System.out.println("0 or 1 Triangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}