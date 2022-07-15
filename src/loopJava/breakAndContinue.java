package loopJava;

public class breakAndContinue {
    public static void main(String[] args) {
        //1.Break: Thoat khoi vong lap, dung vong lap
        for(int i=1; i<=4;i++){
            if(i==3){
                break;
            }
            System.out.println(i+"\t");
        }


        //2.Continue: Bo vong lap hien tai va nhay den vong lap tiep theo
        for(int j=1; j<=4;j++){
            if(j==3){
                continue;
            }
            System.out.println(j+"\t");
        }
    }
}
