public class StringWhileDemo {
    static void main(String[] args) {
        String VARIABLE = "Solar Radiation ";
        System.out.println(VARIABLE);
        System.out.println(VARIABLE.length());
        int i = 0;
        int spaces = 0;
        int uppercase = 0;

        while (i < VARIABLE.length()) {

            char ch = VARIABLE.charAt(i);
            System.out.println(ch);

            if (ch == ' ') {

                spaces++;

            }

            if (Character.isUpperCase(ch)) {

                uppercase++;

            }



            i++;

        }



        System.out.println("Spaces: " + spaces);

        System.out.println("Uppercase letters: " + uppercase);

    }

}


