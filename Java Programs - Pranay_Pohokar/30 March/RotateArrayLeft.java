import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        if (array.length > 1) {
            int temp = array[0]; 
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1]; 
            }
            array[array.length - 1] = temp; 
        }

        System.out.println("Array after left rotation: " + Arrays.toString(array));

        scanner.close();
    }
}
