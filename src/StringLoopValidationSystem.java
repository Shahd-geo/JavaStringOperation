import java.util.Scanner;

public class StringLoopValidationSystem {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println("Original String: " + text);
        System.out.println("Length: " + text.length());
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println("Character: " + ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        if (text.contains(word)) {
            System.out.println("Word found.");
        } else {
            System.out.println("Word NOT found.");
        }

        if (text.length() > 10) {
            System.out.println("The string is long.");
        } else {
            System.out.println("The string is short.");
        }

    }
}
