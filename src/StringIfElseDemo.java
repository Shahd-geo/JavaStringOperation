public class StringIfElseDemo {
    static void main(String[] args) {
        String useName = "shahd";
        System.out.println(useName);
        if (useName.length()> 5 ) {
            System.out.println("USERNAME LENGTH IS VAILD");
        }else {
            System.out.println("username is tooo shoert");

        }
        String password = "12345";
        if (password.equals("12345")){
            System.out.println("password is correct ");

        }else {
            System.out.println("password is  NOT correct ");
        }
        if(useName.contains("a")){
            System.out.println("USERNAME CONTAIN LATTER A");
        }else{
            System.out.println("USERNAME  NOT CONTAIN LATTER A");
        }
        if (useName.isEmpty()){
            System.out.println("USERNAME IS EMPTY");
        }else {
            System.out.println("USERNAME NOT EMPTY");
        }
    }
}
