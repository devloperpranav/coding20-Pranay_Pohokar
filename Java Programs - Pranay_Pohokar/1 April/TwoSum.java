import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Indices of elements whose sum is " + target + ": " + i + " and " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found with the given sum " + target);
        }

    }
}
