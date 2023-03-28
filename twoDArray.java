import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of Rows = ");
            int rowSize = sc.nextInt();

            System.out.print("Enter the number of Columns = ");
            int colSize = sc.nextInt();

            System.out.print("Enter the finding number =");
            int findNum = sc.nextInt();

            int matrix[][] = new int[rowSize][colSize];
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    System.out.print("Enter the " + i + " " + j + " Value = ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // for (int i = 0; i < rowSize; i++) {
            // for (int j = 0; j < colSize; j++) {
            // System.out.print(matrix[i][j] + " ");
            // }
            // System.out.println();
            // System.out.println();
            // }

            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    if (matrix[i][j] == findNum) {
                        System.out.println("The Value of finding number = " + i + " " + j);
                    }
                }
            }
        }
    }
}
