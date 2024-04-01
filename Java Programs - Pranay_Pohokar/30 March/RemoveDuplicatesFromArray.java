import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                array[uniqueCount++] = array[i];
            }
        }

        int[] uniqueArray = Arrays.copyOf(array, uniqueCount);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));


    }
}
