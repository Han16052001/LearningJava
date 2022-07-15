package OOP.Concepts.Inheritance;

public class Teacher extends Person {
    private String subject;
    private String level;

    public Teacher(){}

    public Teacher(String name, int age, String address,String subject, String level) {
        super(name, age, address);
        this.subject=subject;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public String getSubject() {
        return subject;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
