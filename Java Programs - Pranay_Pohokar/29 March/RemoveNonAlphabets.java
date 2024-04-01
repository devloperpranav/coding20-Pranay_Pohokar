import java.util.Scanner;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                result.append(ch);
            }
        }

        System.out.println("String with only alphabetic characters: " + result.toString());

        scanner.close();
    }
}
