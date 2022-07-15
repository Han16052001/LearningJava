package loopJava;

public class whileLoop {
    public static void main(String[] args) {
        //1.While
        /*
        while(condition){
             code block to executed
        }
         */
        int i=0;
        while(i<=5){
            System.out.println(i+"\t");
            i++;
        }

        //2.Do while
        /*
        do{
           code block to be executed
        }
        while(condition)
         */
        int j=0;
        do{
            System.out.println(j+"\t");
            j++;
        }while (j<=5);
    }
}
