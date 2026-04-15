public class StringValidationDemo {
    static void main(String[] args) {
        String variable = "slope";
        System.out.println(variable);
        System.out.println(variable.startsWith("s"));
        System.out.println(variable.endsWith("e"));
        System.out.println(variable.replace("slope", "aspect"));
        System.out.println(variable.substring(1,3));
        System.out.println(variable.length());

    }
}
