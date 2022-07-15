package AbstractANDInterface;

public class main {
    public static void main(String[] args) {
//        Person student=new Student("Nguyen",20,6.5);
//        Person employee=new Employee("Vu",19,7.0);
//
//        student.hoc();
//        employee.hoc();

        Employee employee = new Employee("Nguyen",20,6.5);
        Student student = new Student("Vu",19,8.0);

        employee.readingBook();
        student.readingBook();
        employee.playVideoGame();
        student.playVideoGame();
    }
}
