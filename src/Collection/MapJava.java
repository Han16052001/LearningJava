package Collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        /*
        implementation của Map như sau:
            HashMap
            Hashtable
            LinkedHashMap
            TreeMap
         */

        //Khai bao map
        Map<Integer,String> map=new HashMap();

//      put(): thêm phần tử.
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

//      get(): lấy ra giá trị của key.
        System.out.println(map.get(1));

//      putAll(): thêm phần tử từ map khác.
        Map<Integer,String> map1=new HashMap();
        map1.put(4,"Four");
        map1.put(5,"Five");
        map.putAll(map1);


//      remove(): xóa phần tử khỏi map.
//        map.remove(5);
//      clear(): xóa hết phần tử của map.
//        map.clear();
//      size(): trả về kích thước của map.
        System.out.println(map.size());

//      duyệt các phần tử trong map.
        for(Integer key:map.keySet()){
            System.out.println(map.get(key));
        }

//      containsKey(): kiểm tra map có chứa key đã tồn tại.
        System.out.println(map.containsKey(9));

//      containsValue(): kiểm tra map có chứa value đã tồn tại.
        System.out.println(map.containsValue("Six"));
    }
}
