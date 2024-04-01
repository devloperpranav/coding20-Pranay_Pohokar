import java.util.Scanner;

public class WordWithMaxRepeatedLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        String wordWithMaxRepeatedLetters = null;
        int maxRepeatedLetters = 1; 

        for (String word : words) {
           
            int[] count = new int[26]; 

            for (char ch : word.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch)) {
                    count[ch - 'a']++;
                }
            }

            int maxCount = 0;
            for (int num : count) {
                if (num > 1 && num > maxCount) {
                    maxCount = num;
                }
            }

            if (maxCount > maxRepeatedLetters) {
                maxRepeatedLetters = maxCount;
                wordWithMaxRepeatedLetters = word;
            }
        }

        if (wordWithMaxRepeatedLetters != null) {
            System.out.println( wordWithMaxRepeatedLetters);
        } else {
            System.out.println(-1);
        }

        scanner.close();
    }
}
