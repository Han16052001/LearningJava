package Advance.EqualsAndHashcode;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //Ktra null va khac voi obj cua student
        if(obj==null || !(obj instanceof Student)){
            return false;
        }

        //SS 2 student
        Student studentOther=(Student) obj; //ep kieu
        if(this.id==studentOther.id){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }
}
