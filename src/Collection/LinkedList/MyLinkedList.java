package Collection.LinkedList;

public class MyLinkedList<E> {

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes=0;

    //Phuong thuc khoi tao ko tham so
    public MyLinkedList(){}

    //Them doi tuong tai vi tri thu index trong MyLinkedList
    public void add(int index,E data){
        //Khai bao 1 node temp de chua node dau tien
        Node temp=head;
        //Khai bao node holder
        Node holder;
        //Cho con tro chay tu vi tri index-1
        for(int i=0;i<index-1&&temp.next != null;i++){
            temp=temp.next;
        }
        //holder thamm chieu den node tai vi tri index
        holder=temp.next;
        //Node tai vi tri index-1 tro toi node moi
        temp.next=new Node(data);
        //Node moi tro toi holder
        temp.next.next=holder;
        //tang so luong phan tu len 1
        numNodes++;

    }

    //Phuong thuc tra ve so phan tu trong danh sach
    public int size(){
        return numNodes;
    }

    //phuong thuc tra ve data theo index
    public Object get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    //Phuong thuc kiem tra 1 phan tu co ton tai trong danh sach hay ko
    public boolean contains(E element){
        Node temp=head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        if(temp.data.equals(element)){
            return true;
        }
        return false;
    }

    //Phuong thuc tra ve vi tri cua 1 phan tu trong danh sach
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((E)temp.getData() == element)
                return i;
                temp = temp.next;
        }
        return -1;
    }

    //Phuong thuc them phan tu vao vi tri cuoi cung
    public void addLast(E e){
        //Khai bao node tro den node head
        Node temp=head;
        //Cho con tro chay den phan tu cuoi cung(phan tu cuoi cung se co next==null)
        while (temp.next != null){
            temp=temp.next;
        }
        //Phan tu cuoi cung se tro den node moi
        temp.next=new Node(e);
        numNodes++;
    }

    //Phuong thuc them 1 phan tu vao vi tri dau tien
    public void addFirst(E e){
        //Khai bao 1 bien temp tham chieu den vi tri cua head
        Node temp=head;
        //Head nhan gia tri node moi
        head=new Node(e);
        //head tro den bien temp la head cu
        head.next=temp;
        //tang so luong phan tu cua danh sach len 1
        numNodes++;
    }

    //Phuong thuc remove tai vi tri index
    public E remove(int index){
        //Ktra dieu kien index, throw exception neu index lon hon so luong node hoac nho hon 0
        if (index<0 || index>numNodes){
            throw new IndexOutOfBoundsException();
        }

        //Khai bao 1 node den head
        Node temp=head;
        //khai bao doi tuong object de nhan du lieu tra ve
        Object data;

        //Neu index=0 thi tra ve data hien tai va head moi se la node ke tiep
        if(index==0){
            data=temp.data;
            head=head.next;
        }else {
            //Neu index>0 cho con tro chay den index-1
            for (int i=0;i<index-1&&temp.next!=null;i++){
                temp=temp.next;
            }
            //data tro den node index
            data=temp.next.data;
            //data index tro toi index+2
            temp.next=temp.next.next;

        }
        numNodes--;
        return (E) data;
    }

    //Phuong thuc remove 1 doi tuong
    public boolean remove(E element){
        //remove neu doi tuong la head
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            //Khai bao 1 node tro den head
            Node temp=head;
            //Cho vong lap chay den het danh sach
            while (temp.next!=null){
                //Neu ton tai 1 phan tu co data=data input thi node do se tro den node thu 2 ke tiep
                if(temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }

    //Phuong thuc tao 1 ban sao
    public MyLinkedList<E> clone(){
        //Neu so phan tu =0 thi throw exception
        if(numNodes==0){
            throw new NullPointerException();
        }
        //Khai bao danh sach tra ve
        MyLinkedList<E>temp=new MyLinkedList<E>();
        //Khai bao node tro den head
        Node tempNode=head;
        //add head vao danh sach tra ve
        temp.addFirst((E) tempNode.data);
        //Tro den node ke tiep
        tempNode=tempNode.next;
        //add tat ca node ke tiep vao danh sach
        while (tempNode!=null){
            temp.addLast((E) tempNode.data);
            tempNode=tempNode.next;
        }
        return temp;
    }


}
