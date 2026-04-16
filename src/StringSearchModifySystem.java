import java.util.Scanner;

public class StringSearchModifySystem {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println("Original String: " + text);

        System.out.print("Enter word to search: ");
        String search = input.nextLine();

        if (text.contains(search)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word NOT found");
        }

        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        String modified = text.replace(oldWord, newWord);

        System.out.println("Modified String: " + modified);
        if (modified.length() >= 5) {
            System.out.println("Substring (0-5): " + modified.substring(0, 5));
        } else {
            System.out.println("String too short for substring.");
        }

        if (!modified.isEmpty()) {
            System.out.println("First character: " + modified.charAt(0));
        }

        if (modified.length() > 8) {
            System.out.println("String is long.");
        } else {
            System.out.println("String is short.");
        }
    }
}