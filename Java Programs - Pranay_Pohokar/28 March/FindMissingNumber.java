import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of elements: ");
        int total_num = scanner.nextInt();

        int[] numbers = new int[total_num - 1]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < total_num - 1; i++) {
            numbers[i] = scanner.nextInt();
        }
  

        int expected_num_sum = total_num * ((total_num + 1) / 2);

        int num_sum = 0;

        for (int num : numbers) {
    
            num_sum += num;
        }

        System.out.print("The missing number is: " + (expected_num_sum - num_sum));
        System.out.println(); 
    }
}
