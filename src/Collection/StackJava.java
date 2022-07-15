package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        //push():them phan tu vao dau stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //peek(): tra ve phan tu o dau stack
        System.out.println(stack.peek());

        //pop():lay phan tu o dau stack dong thoi xoa no khoi stack
 //       System.out.println(stack.pop());

        //size(): tra ve kich thuoc cua stack
        System.out.println(stack.size());

        //search(): tra ve vi tri cua phan tu can tim- tinh tu dinh stack
        System.out.println(stack.search(2));

        //duyet cac phan tu
        Iterator<Integer> iterator=stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"\t");
        }
    }
}
