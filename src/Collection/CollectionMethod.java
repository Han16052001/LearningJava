package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();

//        addAll(): them mot hoac nhieu phan tu vao tap hop
        Collections.addAll(list,3,2,1,5,4);
        System.out.println(list.toString());
//        sort(): sap xep cac phan tu cua tap hop
        Collections.sort(list);
        System.out.println(list.toString());
//        binarySearch(): tim kiem nhi phan
        System.out.println(Collections.binarySearch(list,4));
//        reverse(): dao nguoc cac phann tu trong tap hop
        Collections.reverse(list);
        System.out.println(list.toString());
//        shuffle(): xao tron cac phan tu trong tap hop
        Collections.shuffle(list);
        System.out.println(list.toString());
//        replaceAll(): thay the cac phan tu trong tap hop bang 1 phan tu khac
        Collections.replaceAll(list,1,100);
        System.out.println(list.toString());
    }
}
