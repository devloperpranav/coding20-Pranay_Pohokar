import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        int ctr_even = 0, ctr_odd = 0;

        System.out.println("Original Array: " + Arrays.toString(nums));

        for (int num : nums) {
            if (num % 2 == 0) {

                ctr_even++;
            } else {

                ctr_odd++;
            }
        }

        System.out.printf("\nNumber of even elements in the array: %d", ctr_even);
        System.out.printf("\nNumber of odd elements in the array: %d", ctr_odd);
        System.out.printf("\n");
    }
}
