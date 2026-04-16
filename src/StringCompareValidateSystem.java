import java.util.Scanner;

public class StringCompareValidateSystem {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string");
        String TEXT = input.nextLine();
        System.out.println("the orginal string" + " "+TEXT);
        System.out.println("the total cumber of characters : " + TEXT.length());
        System.out.println("enter another string");
        String TEXT2 = input.nextLine();
        if (TEXT.equals(TEXT2)) {
            System.out.println("strings are equals");

        } else {
            System.out.println("strings are not equals");
        }
        System.out.println(" enter a prefix value  ");
        String PREFIX = input.nextLine();
        if (TEXT.startsWith(PREFIX)) {
            System.out.println("string is  started with prefix");
        } else {
            System.out.println("string is  not started with prefix");
        }
        System.out.println("enter  a suffix value  ");
        String SUFFIX = input.nextLine();
        if (TEXT.endsWith(SUFFIX)) {
            System.out.println("string ends with suffix");
        } else {
            System.out.println("string  not ends with suffix");
        }
        if (TEXT.length() > 8) {
            System.out.println("the string is long");
        } else {
            System.out.println("the string is short");
        }
    }
}
