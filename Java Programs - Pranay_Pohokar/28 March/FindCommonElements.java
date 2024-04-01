import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));
        
        System.out.println("Common elements:");
        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break; 
                }
            }
        }
    }
}
