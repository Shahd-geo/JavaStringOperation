import java.util.Scanner;

public class CompleteStringProcessingSystem {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println("Original String: " +" " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.print("Enter word to search: ");
        String word = input.nextLine();
        if (text.contains(word)) {
            System.out.println("Word found");

        } else {
            System.out.println("Word NOT found");

        }


        System.out.print("Enter another string: ");
        String text2 = input.nextLine();
        if (text.equalsIgnoreCase(text2)) {

            System.out.println("Strings are equal");

        } else {

            System.out.println("Strings are NOT equal");

        }


        if (!text.isEmpty()) {

            System.out.println("First character: " + text.charAt(0));

        }


        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);



        if (text.length() > 10) {

            System.out.println("The string is long.");

        } else {

            System.out.println("The string is short.");

        }


    }
}
