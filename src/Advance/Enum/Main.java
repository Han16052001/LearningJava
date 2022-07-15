package Advance.Enum;

public class Main {

    enum Level{
        LOW,      //Vi gia tri trong enum la hang so nen t phai viet hoa tat ca
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level level = Level.HIGH;

        switch (level){
            case LOW:
                System.out.println("Low level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
        }

        //Su dung forEach de duyet cac phan tu trong enum, su dung values
        for(Level elements: Level.values()){
            System.out.println(elements);
        }
    }
}
