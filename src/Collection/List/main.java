package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();

        //add(): Them phan tu
        list1.add("A");
        list1.add("B");
        list1.add("C");

        //size(): Tong so phan tu cua tap hop
        System.out.println(list1.size());

        //addAll(): Them cac phan tu tu cac collection co san
        List<String> list2= new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list1.addAll(list2);

        //get(): lay gia tri phan tu theo index
        System.out.println(list1.get(1));

        //set(): cap nhap gia tri cua phan tu
        list1.set(4,"F");

        //indexOf(): tra ve index cua phan tu can tim
        System.out.println(list1.indexOf("F"));

        //lastIndexOf(): tra ve index cuoi cung cua phan tu
        list1.add("A");
        System.out.println(list1.lastIndexOf("A"));

        //remove(): xoa phan tu khoi danh sach
        list1.remove(5);

        //contains(): kiem tra phan tu can tim co trong tap hop hay ko
        System.out.println(list1.contains("G"));

        //sublist(): tao tap hop moi tu tap hop cho truoc
        List<String> newList= list1.subList(0,2);

        //clear(): xoa toan bo phan tu trong tap hop
  //      list1.clear();

        //toArray(): chuyen tu tap hop ArrayList thanh tap hop Array
        //asList(): chuyen Array thanh ArrayList


        System.out.println("--------------------------");
        for(String elements: list1){
            System.out.print(elements+"\t");
        }

        System.out.println("--------------------------");

        for(String elements2: newList){
            System.out.print(elements2+"\t");
        }


    }
}
