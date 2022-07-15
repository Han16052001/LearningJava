package Advance.StringBufferAndStringBuilder;

import java.util.GregorianCalendar;

public class TestString {
    /*
    . String là immutable do vậy chúng ta không thể thay đổi được giá trị của nó.
    Nếu chúng ta muốn thay đổi String ví dụ như nối chuỗi, cắt string thành từng đoạn.
    Thì chúng ta sẽ phải tạo ra một String mới và không sử dụng lại được giá trị String cũ.
    Giá trị String cũ sẽ bị bộ dọn rác garbage collection của Java xoá đi khỏi bộ nhớ.
Chính vì giá trị cũ tồn tại nhiều trong bộ nhớ mỗi lần chúng ta muốn thao tác với String dẫn đến bộ nhớ sẽ bị đầy do chứa nhiều giá trị rác.
Để giải quyết được việc này Java cung cấp cho chúng ta 2 lớp là StringBuffer và StringBuilder để phục vụ mục đích thao tác với String.
Khác với String hai lớp StringBuffer và StringBuilder là mutable (có thể thay đổi giá trị). 2 lớp này cung cấp cho chúng ta các method để thêm,sửa, xóa để thao tác với String.
     */

    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder(); su dung tk nay se nhanh hon

        //Cho chay run time de so sanh
        for(int i = 0; i<10000000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }
}
