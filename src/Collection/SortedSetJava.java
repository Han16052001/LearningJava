package Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetJava {
    public static void main(String[] args) {
           /*
        implementation của SortedSet như sau:
            TreeSet
        */

        //Khai bao tree set
     //   SortedSet sortedSet=new TreeSet();
        TreeSet sortedSet=new TreeSet();

        //      add(): thêm phần tử.
        sortedSet.add("A");
        sortedSet.add("C");
        sortedSet.add("B");
        sortedSet.add("D");

        //      remove(): xóa phần tử.
        sortedSet.remove("D");

        //      first(): lấy phần tử đầu tiên.
        System.out.println(sortedSet.first());

        //      last(): lấy phần tử cuối cùng.
        System.out.println(sortedSet.last());

        //       duyệt các phần tử.
        Iterator iterator=sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //      descendingIterator(): sắp xếp giảm dần.
        Iterator iterator1=sortedSet.descendingIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //      headSet(): lấy các phần tử từ đầu SortedSet đến phần tử cho trước
        SortedSet sortedSet1=sortedSet.headSet("D");
        Iterator iterator2 =sortedSet1.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

            //      tailSet(): lấy các phần tử từ phần tử cho trước đến phần tử cuối SortedSet
        SortedSet sortedSet2=sortedSet.tailSet("B");
        Iterator iterator3 =sortedSet1.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }
}
