public class StringDoWhileDemo {
    static void main(String[] args) {
        String MOTIVATION = "YOU CAN DO IT";
        System.out.println(MOTIVATION);
        System.out.println(MOTIVATION.length());
        int i = 0;
        int lowecase = 0;
        do{
            char ch = MOTIVATION.charAt(i);
            System.out.println(ch);
            if (Character.isLowerCase(ch)) {
                lowecase++;
            }

            i++;

        } while (i<MOTIVATION.length());
        System.out.println(lowecase);


    }

}
