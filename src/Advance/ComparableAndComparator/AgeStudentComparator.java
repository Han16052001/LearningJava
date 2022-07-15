package Advance.ComparableAndComparator;

import java.util.Comparator;


//Tao comparator o cach thu 1 la tao ra 1 class rieng
public class AgeStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
