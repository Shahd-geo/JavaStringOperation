public class StringSwitchDemo {
    static void main(String[] args) {
        String department = "Geography";
        System.out.println(department);
        switch (department) {
            case "GIS":
                System.out.println("GEOGRAPHIC INFORMATION SYSTEM");
                break;
            case "IT":
                System.out.println("INFORMATION SYSTEM");
                break;
            case "RS":
                ;
                System.out.println("REMOTE SENSING");
                break;
            default:
                System.out.println("UNKOWING DEPARTMENT");


        }
    }
}
