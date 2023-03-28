
// import java.util.Scanner;
import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        // Output
        System.out.print("Hello World\n");
        System.out.println("Next Line");
        // Input
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            int integer = sc.nextInt();
            System.out.println(name);
            System.out.println(integer);
        }
        // Data Type
        int a, b;
        a = 10;
        b = 20;

        // int sum = a + b;
        System.out.println("Sum of two num = " + (a + b));
        int diff = a - b;
        System.out.println(diff);
        if (a < 20) {
            System.out.println("Joker");
        } else {
            System.out.println("Nothing");
        }
        switch (a) {
            case 9:
                System.out.println("break me");
                break;
            case 10:
                System.out.println("Great");
                break;
            default:
                System.out.println("Wow");
                break;
        }
    }
}