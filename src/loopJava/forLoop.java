package loopJava;

public class forLoop {
    public static void main(String[] args) {

        //1.for thuong
        /*
        for(initial-action; loop-condition; action-after-each-iteration){
            code block to excuted
        };
        */
        for(int index=1; index<=4;index++){
            System.out.println(index+"\t");
        }

        //2.for each
        /*
        for(type variableName:arrayName){
             code block to executed
        }
         */
        String colors[]={"Blue, Red, Black, Yellow "};
        for(String elements :colors){
            System.out.println(elements+"\t");
        }
    }
}
