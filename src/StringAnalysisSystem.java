import java.util.Scanner;

public class StringAnalysisSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ASAMPLE STRING");
        String text = sc.nextLine();
        System.out.println("orginal text:" + text);
        System.out.println("length text:" + text.length());
        System.out.println("enter words to search");
        String word = sc.nextLine();
        if (text.contains(word)) {
            System.out.println("FOUND IT");
        } else {
            System.out.println("THE WORD NOT EXIT");
        }
        System.out.println("enter another string");
        String TEXT2 = sc.nextLine();
        if (text.equalsIgnoreCase(TEXT2)) {
            System.out.println("STRINGS ARE EQUALS");
        } else {
            System.out.println("string are not equals ");
        }
        System.out.println("enter frist latter" + text.charAt(0));
        if (text.length() > 10) {
            System.out.println("the strong is long");
        } else {
            System.out.println("the string is short");
        }
    }
}
