public class StringLoopDemo {
    static void main(String[] args) {
        String VARIABLE = "Solar Radiation ";
        System.out.println(VARIABLE);
        System.out.println(VARIABLE.length());
        for (int i = 0; i < VARIABLE.length(); i++) {
            char ch = VARIABLE.charAt(i);
            System.out.println(ch);
        }
        int count =0;
        for (int v= 0; v<VARIABLE.length();v++){
            char vo= Character.toLowerCase(VARIABLE.charAt(v));
            if (vo== "a" || vo=="o" ||vo== "u" || vo =="i" || vo == "e"){
                count++;
            }
        System.out.println(count);
    }
}
}