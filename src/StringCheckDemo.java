public class StringCheckDemo {
    static void main(String[] args) {
        String massage = ("Keep going");
        System.out.println(massage);
        System.out.println(massage.substring(1,6));
        System.out.println(massage.replace("going","go"));
        System.out.println(massage.contains("go"));
    }
}
