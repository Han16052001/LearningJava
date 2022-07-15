package Advance.EqualsAndHashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"Nguyen");
        Student student2=new Student(1,"Nguyen");
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);

        for(Student studentList: studentSet){
            System.out.println(studentList);
        }

    }
}
