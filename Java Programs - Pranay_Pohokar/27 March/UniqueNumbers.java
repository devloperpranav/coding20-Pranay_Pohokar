import java.util.*;


public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nUnique Numbers:");
        printUniqueNumbers(array);
    }
    

    public static void printUniqueNumbers(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }
    

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
