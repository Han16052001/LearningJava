package InputAndOutputFile;


import InputAndOutputFile.Common.FileUtils;
import InputAndOutputFile.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static final String FILE_NAME="src/InputAndOutputFile/Data/Student.csv";
    public static final String COMMA=",";

    public static void main(String[] args) {

        //output file
//        Student student1= new Student(1,"nguyen","16/05/2001");
//        Student student2= new Student(2,"Vu","21/09/2003");
//        Student student3= new Student(3,"Jack","01/01/1999");
//
//        List<Student> students=new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        String line=null;
//        for(Student student: students){
//            line=student.getId()+COMMA+student.getName()+COMMA+student.getDateOfBirth();
//            FileUtils.writeFile(FILE_NAME,line);
//        }

        //Input file
        List<String> listLine=FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

        //Path ra kieu student
        String[]  lineSplit=listLine.get(0).split(COMMA);
        Student student1= new Student(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2]);
        System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getDateOfBirth());
    }

}
