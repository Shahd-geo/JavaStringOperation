import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMenuDemo {
    static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("inter your name");
        String name = inputs.nextLine();
        System.out.println("Menue :");
        System.out.println("1. length:");
        System.out.println("2. upercase:");
        System.out.println("3. :lowercase");
        System.out.println("4. search for specific lateer:");
        System.out.println("5. compare:");
        System.out.println("enter your choose:");

        int choise =inputs.nextInt();
        switch (choise){
            case 1 :
                System.out.println("LENGTH:"+name);
                break;
            case 2 :
                System.out.println("UPPERCASE:"+name.toUpperCase());
                break;
            case 3:
                System.out.println("LOWERCASE:"+name.toLowerCase());
                break;
            case 4:
                if(name.contains("java")){
                    System.out.println("Contains java");
                }
                else{
                    System.out.println("Does not contain java");
                }
                break;
            case 5 :
                inputs.nextLine();
                System.out.println("Enter another string:");
                String text2=inputs.nextLine();
                if(text2.equalsIgnoreCase(text2)){
                    System.out.println("Strings match");
                }
                else{
                    System.out.println("Strings do not match");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}


