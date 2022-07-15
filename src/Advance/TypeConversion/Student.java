package Advance.TypeConversion;

public class Student extends Person {
    private String classRoom;

    public Student() {

    }

    public Student(String name, String classRoom) {
        super(name);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}
