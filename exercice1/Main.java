/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setStdName("Kiran");
        student.setStdRollNo(4);
        student.setStdID(12345);

        System.out.println("Student's Name : " + student.getStdName());
        System.out.println("Student's RollNo : " + student.getStdRollNo());
        System.out.println("Student's ID : " + student.getStdID());
    }
}