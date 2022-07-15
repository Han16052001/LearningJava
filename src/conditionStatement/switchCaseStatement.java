package conditionStatement;

public class switchCaseStatement {
    public static void main(String[] args) {

        int day=3;
        switch (day){
            case 1:
                System.out.println("You are in day 1");
                break;
            case 2:
                System.out.println("You are in day 2");
                break;
            case 3:
                System.out.println("You are in day 3");
                break;
            default: // nam ngoai gia tri trong case
                System.out.println("Not found");
        }
    }
}
