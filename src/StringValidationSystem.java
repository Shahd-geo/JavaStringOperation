import java.util.Scanner;

public class StringValidationSystem {
    static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a sample string");
        String text = SC.nextLine();
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
       String search = SC.nextLine();
        if(text.contains("java")){
            System.out.println("Contains java");
        }
        else{
            System.out.println("Does not contain java");
        }
        SC.nextLine();
        System.out.println("Enter another string:");
        String text2=SC.nextLine();
        if(text2.equalsIgnoreCase(text2)){
            System.out.println("Strings match");
        }
        else{
            System.out.println("Strings do not match");
        }
        if (text.length()>5) {
            System.out.println("TEXT VALIDATE");
        }else{
            System.out.println("TEXT TO SHORT");
        }
    }
}
