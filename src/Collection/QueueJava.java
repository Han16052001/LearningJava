package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
            /*
        implementation của Queue như sau:
            LinkedList
            PriorityQueue
            ArrayDeque
         */
        //Khai bao
        Queue<String> queue= new LinkedList<>();

//      add(), offer(): thêm phần tử.
        queue.add("A");
        queue.offer("B");
        queue.add("C");

//      peek(), element(): lấy ra phần tử ở đầu hàng đợi.
        System.out.println(queue.peek());
        System.out.println(queue.element());

//      poll(), remove(): lấy ra phần tử ở đầu hàng đợi và xóa nó.
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());

//      clear(): xóa tất cả phần tử trong hàng đợi.
//         queue.clear();

//      isEmpty(): kiểm tra hàng đợi có rỗng hay không.
        System.out.println(queue.isEmpty());
//      contains(): kiểm tra phần tử đã có trong hàng đợi.
        System.out.println(queue.contains("C"));
//      size(): trả về kích thước của queue;
        System.out.println(queue.size());
//      duyệt các phần tử trong hàng đợi.
        for(String elements:queue){
            System.out.println(elements+"\t");
        }
    }
}
