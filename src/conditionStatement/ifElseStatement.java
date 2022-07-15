package conditionStatement;

public class ifElseStatement {
    public static void main(String[] args) {
        int x=20, y=18, time=21;

        //if khuyet
        if(x>y){
            System.out.println("x lon hon y");
        }

        //if day du
        if (time > 20){
            System.out.println("Good morning");
        }else {
            System.out.println("Good night");
        }

        //if bac thang
        if(time>20){
            System.out.println("Good morning");
        } else if (time==20) {
            System.out.println("Good noon");
        } else if (time<20) {
            System.out.println("Good night");
        }

        //Toan tu ba ngoi
        String result= (time>20) ? "Good morning" : "Good night";
        System.out.println(result);

    }
}
