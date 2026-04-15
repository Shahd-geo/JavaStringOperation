public class StringReverseDemo {
    static void main(String[] args) {
        String TEXT = "CODE CHAMPS ";
        System.out.println(TEXT);
        System.out.println(TEXT.length());
        for (int i = 0 ; i <TEXT.length();i++){
        System.out.println(TEXT.charAt(i));
        }
        for (int i=TEXT.length()-1 ; i>= 0 ; i--){
       System.out.println(TEXT.charAt(i));
        }
        String REVER = "";
        for (int i=TEXT.length()-1 ; i>= 0 ; i--){
        REVER += TEXT.charAt(i);
        }
        System.out.println(REVER);
        char abc="a";
        int count = 0;
        for(int i = 0 ; i<TEXT.length(); i++){
            if (TEXT.charAt(i)==abc){
                count++;
            }
            System.out.println(abc);
        }
    }
}