package AbstractANDInterface;

public class Employee extends Person implements ReadBook,PlayGame {
    private double toeicPoint;


    public Employee(String name, int age, double toeicPoint) {
        super(name, age);
        this.toeicPoint = toeicPoint;
    }

    public double getToeicPoint() {
        return toeicPoint;
    }

    public void setToeicPoint(double toeicPoint) {
        this.toeicPoint = toeicPoint;
    }

    @Override
    public void hoc() {
        System.out.println("Diem thi toeic la: "+getToeicPoint());
    }

    @Override
    public void readingBook() {
        System.out.println("Doc sach nghiep vu");
    }

    @Override
    public void playVideoGame() {
        System.out.println("Ko dc choi game");
    }
}
