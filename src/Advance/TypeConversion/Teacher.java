package Advance.TypeConversion;

public class Teacher extends Person {
    private String level;

    public Teacher() {

    }

    public Teacher(String name, String level) {
        super(name);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
