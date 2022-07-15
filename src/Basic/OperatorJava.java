package Basic;
public class OperatorJava {
    public static void main(String[] args) {
        //1.Toan tu so hoc: +,-,*,/,%,++,--
        int x=8;
        //System.out.println(++x);//in ra 9,neu x++ thi in ra 8

        //2.Toan tu gan: =,+=,-=,*=,/=,%=
        x+=1; // x=x+1

        //3.Toan tu so sanh: ==,!=,>,<,>=,<=
        System.out.println(9==8); //ket qua tra ve false

        //4.Toan tu logic: &&,||,!
        System.out.println(6>2 && 6>9); //ket qua tra ve false
        System.out.println(6>2 || 6>9); //ket qua tra ve true

        //5.Toan tu bit: &,|,~,^,>>,<<,>>>
        System.out.println((char)('A'|' '));// chuyen 1 ky tu hoa thanh thuong
    }
}
