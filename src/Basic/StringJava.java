package Basic;

import java.util.Locale;

public class StringJava {
    public static void main(String[] args) {
        String str ="Hello world";

        //In ra do dai chuoi
        System.out.println(str.length());

        //In hoa chuoi
        System.out.println(str.toUpperCase());

        //In thuong chuoi
        System.out.println(str.toLowerCase());

        //Tim vi tri chuoi con trong chuoi
        System.out.println(str.indexOf("o"));

        //Tim vi tri chuoi con tiep theo trong chuoi
        System.out.println(str.lastIndexOf("o"));

        //noi 2 chuoi voi nhau
        String lastName="Nguyen";
        String firstName="Ho Anh";
        System.out.println(firstName.concat(firstName));

        //hien thi ky tu dac biet
        System.out.println("Ho Anh \"Nguyen");

        //xuong hang
        System.out.println("Ho Anh \nNguyen");

        //cach nhau bang 1 tab
        System.out.println("Ho Anh \tNguyen");

        //Hien thi backspace
        System.out.println("Ho Anh \bNguyen");

        //Su dung dau + de noi 2 chuoi se cho ra 1 day so
        String x="10";
        String y="20";
        System.out.println(x+y);

    }
}
