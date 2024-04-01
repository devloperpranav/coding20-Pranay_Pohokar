import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        sortFirstHalfAscending(array);
        sortSecondHalfDescending(array);
        
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    

    public static void sortFirstHalfAscending(int[] array) {
        for (int i = 0; i < array.length / 2 - 1; i++) {
            for (int j = i + 1; j < array.length / 2; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    

    public static void sortSecondHalfDescending(int[] array) {
        for (int i = array.length / 2; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
