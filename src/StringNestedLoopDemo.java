public class StringNestedLoopDemo {
    static void main(String[] args) {
        String str1 = "Solar";
        String str2 = "Radar";

        System.out.println( str1);
        System.out.println( str2);
        System.out.println(str1.length());
        System.out.println(str2.length());

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                char ch1 = Character.toLowerCase(str1.charAt(i));
                char ch2 = Character.toLowerCase(str2.charAt(j));

                if (ch1 == ch2) {
                    System.out.println("Match: " + ch1);
                    count++;
                }
            }
        }

        System.out.println( count);
    }
}


