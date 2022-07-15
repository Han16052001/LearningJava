package Advance.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //in ra ngay thang nam hien tai
        LocalDate timeNow= LocalDate.now();
        System.out.println(timeNow);

        //in ra gio phut giay
        LocalTime timeNow2= LocalTime.now();
        System.out.println(timeNow2);

        //Lay ca 2
        LocalDateTime timeNow3 = LocalDateTime.now();
        System.out.println("Before Formatting: "+timeNow3);

        //Thay doi format hien thi
        DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String timeNow4 = myFormat.format(timeNow3);
        System.out.println("After Formatting: "+ timeNow4);
    }
}
