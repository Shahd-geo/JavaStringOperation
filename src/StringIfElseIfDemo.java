public class StringIfElseIfDemo {
    static void main(String[] args) {
        String text = "Good Morning";
        System.out.println(text);
        if (text.isEmpty()){
            System.out.println("THIS TEXT IS EMPTY");
        }else if (text.length()<5){
            System.out.println("the string is short");
        } else if (text.startsWith("G")) {
            System.out.println("THIS TEXT START WITH G");

        } else if (text.endsWith("n")) {
            System.out.println("THE TEXT END WITH g");

        } else if (text.equalsIgnoreCase("good morning")) {
            System.out.println("THE TEXT EQUALS good morning ignore case");

        }else {
            System.out.println("NO CONDITIONS MATCHED");
        }
    }

}
