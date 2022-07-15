package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetJava {
    public static void main(String[] args) {
          /*
        implementation của Set như sau:
            HashSet
            LinkedHashSet
            TreeSet
            EnumSet
         */

        //Khai bao set
        Set<String> mySet =new HashSet<>();

//      add(): thêm phần tử.
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");

//      duyệt các phần tử bằng Iterator, forEach.
        //forEach
//        for(String elements:mySet){
//            System.out.printf(elements);
//        }
//        //iterator
//        Iterator<String> iterator=mySet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//      addAll(): để thêm các phần tử từ một tập hợp khác vào trong Set, convert Set thành List
        Set<String> mySet2= new HashSet<>();
        mySet2.add("4");
        mySet2.add("5");
        mySet.addAll(mySet2);
        for(String elements:mySet){
            System.out.printf(elements);
        }

//      size(): kiểm tra kích thước của tập hợp.
        System.out.println(mySet.size());

//      isEmpty(): kiểm tra Set có rỗng hay không.
        System.out.println(mySet.isEmpty());

//      contains(): kiểm tra một phần tử có tồn tại trong Set hay chưa.
        System.out.println(mySet.contains("a"));//false
    }
}
