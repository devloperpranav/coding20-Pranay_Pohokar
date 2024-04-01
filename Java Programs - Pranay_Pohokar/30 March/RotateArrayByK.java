import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        System.out.println("Original Array: " + Arrays.toString(array));

        if (array != null && array.length > 1) {
            int length = array.length;
            k = k % length; 
            
            for (int i = 0; i < k; i++) {
                int temp = array[0];
                for (int j = 0; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[length - 1] = temp;
            }
        }

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(array));


    }
}

