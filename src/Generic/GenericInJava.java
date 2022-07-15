package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericInJava {

    //Ky tu dai dien trong Generic
//    Trong Generic nhiều lúc chúng ta sẽ gặp các ký tự đại diên như : (?),(wildcard), nó đại diện cho một loại dữ liệu không rõ ràng.
//    Collection<?>
//    List<? extends Number>
//    Comparator<? super String>
//    Pair<String,?>.
//    Ký tự đại diện <?> chấp nhận tất cả các loại đối số (chứa mọi kiểu đối tượng). Ví dụ: Collection<?> mô tả một tập hợp chấp nhận tất cả các loại đối số kiểu String, Integer, Boolean, …
//
//    Ký tự đại diện <? extends type>: Các đối tượng bất kỳ nào cũng được nhưng bắt buộc phải có cùng kiểu dữ liệu mới hợp lệ . Ví dụ: List<? extends Number> mô tả một danh sách, nơi mà các phần tử là kiểu Number hoặc kiểu con của Number.
//
//    Ký tự đại diện <? super type> chấp nhận bất ký đối tượng nào miễn là đối tượng này là cha của type hoặc đối tượng của type.

    //Dung chung cho tat ca su dung dau ?
    public static void printElements(List<?> list){
        for(Object o: list){
            System.out.println(o.toString());
        }
        System.out.println();
    }

    //Su dung extend va super de chi in mot kieu du lieu duy nhat
//    public static void printElements(List<? extends Number> list){  //chi cho phep in kieu so
//        for(Object o: list){
//            System.out.println(o.toString());
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Double> doubles =new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);

        List<String> strings=new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        printElements(integers);
        printElements(doubles);
        printElements(strings);
    }
}
