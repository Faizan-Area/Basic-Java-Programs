import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Size of Array = ");
            int num = sc.nextInt();
            int marks[] = new int[num];
            System.out.print("Enter the Value You Find = ");
            int x = sc.nextInt();

            // Input Value
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter the Marks " + i + " Value = ");
                marks[i] = sc.nextInt();
                // System.out.println();
            }

            // Output Value
            System.out.println();
            for (int i = 0; i < marks.length; i++) {
                // System.out.print("Value of Marks " + i + " = " + marks[i]);
                // System.out.println();
                if (marks[i] == x) {
                    System.out.println("Your value at = " + i);
                }
            }

            // int[] marks = new int[3];
            // int marks[] = new int[3];
            // int score[] = {45, 34, 54};
            // marks[0] = 97; // Phy
            // marks[1] = 34; // Chem
            // marks[2] = 87; // Bio
        }

        // // System.out.println(marks[0]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }
        // for (int i = 0; i < 3; i++) {
        // System.out.println(score[i]);
        // }
    }
}
