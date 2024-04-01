import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPangram = true;
        boolean[] occurrence = new boolean[26];

      
        for (char ch : input.toLowerCase().toCharArray()) {
      
            if (ch >= 'a' && ch <= 'z') {
                occurrence[ch - 'a'] = true; 
            }
        }


        for (boolean b : occurrence) {
            if (!b) {
                isPangram = false; 
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string \"" + input + "\" is a pangram.");
        } else {
            System.out.println("The string \"" + input + "\" is not a pangram.");
        }

       
    }
}
