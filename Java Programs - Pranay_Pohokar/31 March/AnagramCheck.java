import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean areAnagrams = true;
        
        if (str1.length() != str2.length()) {
            areAnagrams = false;
        } else {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            

            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i] != charArray2[i]) {
                    areAnagrams = false;
                    break;
                }
            }
        }


        if (areAnagrams) {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }

        scanner.close();
    }
}
