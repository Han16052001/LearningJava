package Advance.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Nguyen",20));
        students.add(new Student("Bon",18));
        students.add(new Student("Vu",19));

        // Cach 1 su dung class tu tao:
        // Collections.sort(students,new AgeStudentComparator());

        //cach2: tao 1 anonymus
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        for(Student student: students){
            System.out.println(student);
        }


    }

}
