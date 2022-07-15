package OOP.Concepts.Inheritance;

public class main {
    public static void main(String[] args) {
        Person person = new Teacher("nguyen",20,"DN","Toan","Master");
        System.out.println(person.getName());

        Employee employee=new Employee("vu",20,"HN","accountant");
        System.out.printf(employee.getWorking());

    }
}
