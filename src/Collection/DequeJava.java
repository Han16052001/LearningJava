package Collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeJava {
    public static void main(String[] args) {
         /*
        implementation của Deque như sau:
            LinkedList
            ArrayDeque
         */

        //Khai bao
        Deque<Integer> deque= new LinkedList<>();

//      add(), addLast(), offerLast(): thêm ở cuối danh sách.
        deque.add(1);
        deque.addLast(2);
        deque.offerLast(3);

//      push(), addFirst(), offerFirst(): thêm ở đầu danh sách.
        deque.push(4);
        deque.addFirst(5);
        deque.offerFirst(6);

//      peek(), peekFirst(), getFirst(): truy xuất phần tử đầu danh sách.
        System.out.println(deque.peek());//mac dinh la o dau
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

//      peekLast(), getLast(): truy xuất phần tử cuối danh sách.
        System.out.println(deque.peekLast());
        System.out.println(deque.getLast());

//      remove(), poll(), removeFirst(), pollFirst(): xóa phần tử đầu danh sách.
       // deque.remove();

//      removeLast(), pollLast(): xóa phần tử cuối danh sách.
       // deque.pollLast();

//      contains(): kiểm tra phần tử có trong danh sách.
        System.out.println(deque.contains(7));

//      duyệt qua các phần tử.
        Iterator<Integer> iterator=deque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
