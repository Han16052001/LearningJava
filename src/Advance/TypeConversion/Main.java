package Advance.TypeConversion;

public class Main {
    public static void main(String[] args) {

        //Ép kiểu ngầm định, vì ở đây float có kiểu dữ liệu lớn hơn nên hệ thống sẽ tự động ép kiểu
//        int a=5;
//        float b;
//        b=a;
//        System.out.println(a+","+b);

        //Ép kiểu tường minh
//        int a;
//        float b=5.5f;
//        a= (int) b; //cach ep kieu
//        System.out.println(a+","+b);//5,5.5
        //Se co mat mat du lieu khi ep kieu, nen can than

        //Ép kiểu theo đối tượng
        Person person = new Student();
        Person person1= new Teacher();
        person1=person;//Gan name cho person cua teacher voi person cua student
        //Neu chuyen 2 tk Person thanh Teacher va Student thi se ko the ep kieu dc vi no ko co diem chung nao ca
        //Con person vi co diem chung la tk name vs 2 tk nen co the set no bang nhau nhu tren

        person.setName("Nguyen");
        ((Student) person).setClassRoom("B3-201");//Ep kieu classroom cua student sang person

        System.out.println(person1.getName());
        System.out.println(person.getName()+","+((Student) person).getClassRoom());

    }
}
