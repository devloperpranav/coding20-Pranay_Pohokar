import java.util.Scanner;

public class MaxOnesInRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array (0 or 1):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxOnesRow = -1;
        int maxOnesCount = 0;
        for (int i = 0; i < rows; i++) {
            int onesCount = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }

        if (maxOnesRow != -1) {
            System.out.println("Row with the maximum number of 1's: " + maxOnesRow);
        } else {
            System.out.println("No row with 1's found.");
        }

    }
}
