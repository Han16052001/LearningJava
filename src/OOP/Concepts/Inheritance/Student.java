package OOP.Concepts.Inheritance;

public class Student extends Person {
    private double gpa;
    private String classSubject;

    public Student(){}

    public Student(String name, int age, String address,double gpa, String classSubject) {
        super(name, age, address);
       this.gpa=gpa;
       this.classSubject=classSubject;
    }

    public double getGpa() {
        return gpa;
    }

    public String getClassSubject() {
        return classSubject;
    }

    public void setClassSubject(String classSubject) {
        this.classSubject = classSubject;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
