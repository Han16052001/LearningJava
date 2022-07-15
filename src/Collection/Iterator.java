package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Iterator<S> {
    public static void main(String[] args) {
        List<Integer> myList= new ArrayList<>();

        Collections.addAll(myList,1,2,3,4,5);

        //thong thuong chung ta co the su dung foreach de duyet qa cac phan tu nhung ta co the su dung iterator

        java.util.Iterator<Integer> iterator= myList.iterator();
        //hien thi phan tu
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //xoa 3 phan tu dau tien
        while(iterator.hasNext()){
            Integer elements=iterator.next();
            if (elements<3){
                iterator.remove();
            }
        }
        System.out.printf(myList.toString());

    }
}
