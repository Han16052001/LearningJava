package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapJava {
    public static void main(String[] args) {
//        Tree map ko chua key null
//        key dc sap xep (mac dinh tang dan)

        Map<Integer,String> map=new TreeMap<>();

//        put():them phan tu
        map.put(2,"Two");
        map.put(1,"One");
        map.put(3,"Three");

//        get():truy cap phhan tu
        System.out.println(map.get(1));
//        put():cap nhap lai gia tri cua key
        map.put(3,"So ba");
//        remove():xoa cac phan tu
//        map.remove(3);
        //duyet cac phan tu
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
