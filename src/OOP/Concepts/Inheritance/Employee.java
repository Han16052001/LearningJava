package OOP.Concepts.Inheritance;

public class Employee extends Person {
    private String working;

    public Employee(){}

    public Employee(String name, int age, String address,String working) {
        super(name, age, address);
        this.working=working;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }
}
