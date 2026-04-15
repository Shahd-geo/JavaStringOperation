public class StringProcessDemo {
    static void main(String[] args) {
        String  employee=( " Shahd , Mubarak , AL Abdali ");
        System.out .println(employee.trim());
        String[] PARTS = employee.split(",");
        System.out.println(PARTS);
        String NAME1=("AHMAD");
        String NAME2=("DMAHA");
        System.out.println(NAME1.equalsFoldCase(NAME2));
        System.out.println(employee.isEmpty());


    }
}
