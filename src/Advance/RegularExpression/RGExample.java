package Advance.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RGExample {

    //validate kieu du lieu cho ng dung va tim chuoi con trong 1 chuoi cho trc
    //^:so khop phan dau, $:so khop phan cuoi,
    // (..):so khop voi nhom ky tu ben trong, [..]:so khop voi bat ki ki tu don nao ben trong
    //  [m-n]:so khop tu ki tu m den n trong ACSII
    // /d: So khop voi ki tu so tu 0-9, /w: so khop voi ki tu chu cai (co so) [a-zA-Z0-9]

    //tên phải có ít nhất là 6 ký tự, và dài nhất là 12 ký tự
    public static final String NAME="^[a-zA-Z ]{6,12}$";

    //Email abc@google.com.vn
    public static final String EMAIL="^\\w+@\\w+(\\.\\w+1){1,2}&";

    //Số điện thoại
    public static final String PHONE="^84\\d{7}$";


    public static void main(String[] args) {
        //Su dung pattern de goi RGE
        Pattern pattern = Pattern.compile(PHONE);
        String input="841234567";
        Matcher matcher = pattern.matcher(input);

        //Su dung matches de kiem tra
        System.out.println(matcher.matches());

    }
}
