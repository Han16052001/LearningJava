package AbstractANDInterface;

public class Student extends Person implements ReadBook,PlayGame{
    private double gpa;

    public Student(String name, int age,double gpa) {
        super(name, age);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void hoc() {
        System.out.println("Diem trung binh la: "+getGpa());
    }

    @Override
    public void readingBook() {
        System.out.println("Doc sach giao khoa");
    }


    @Override
    public void playVideoGame() {
        System.out.println("Danh LOL");
    }
}
