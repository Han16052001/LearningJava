package Basic;
public class MethodJava {
    //Quy dinh pham vi truy cap  Quy dinh tinh chat  Kieu tra ve  Ten Method(co truyen doi so hoac ko)
    /* accessModifier            static/non-static  returnType   methodName(List of parameters)
    { MethodBody  };
     */

    //Co kieu tra ve la in
    public static int sum(int a,int b){
      int result=  a+b;
      return result;
    };

    public static void notification(){
        System.out.println("Fuck you");
    }


    public static void main(String[] args) {
        System.out.println(sum(7,8));
        notification();
        notification();

    }
}
