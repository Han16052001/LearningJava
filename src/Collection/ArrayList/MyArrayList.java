package Collection.ArrayList;

import java.util.Arrays;

public class MyArrayList <E>{

    //So luong phan tu trong MyArrayList
    private int size=0;

    //Suc chua mac dinh trong MyArrayList
    private static final int DEFAULT_CAPACITY=10;

    //Mang doi tuong elements chua cac phan tu trong MyArrayList
    private Object[] elements;

    //Phuong thuc khoi tao ko tham so
    public MyArrayList(){
        System.out.println("Khoi tao thanh cong MyArrayList co kich thuoc la: "+DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Phuong thuc khoi tao co tham so truyen vao
    public MyArrayList(int capacity){
        if(capacity>0){
            System.out.println("Khoi tao thanh cong voi tham so la: "+capacity);
            elements=new Object[capacity];
        }else {
            System.out.println("loi tham so truyen vao");
            throw new IllegalArgumentException("capacity: "+capacity);
        }
    }

    //Phuong thuc tang kic thuoc cua ArrayList
    public void ensureCapacity (int minCapacity){
        if(minCapacity>=0){
            int newSize=this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements,newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc la: "+elements.length);
        }else {
            throw new IllegalArgumentException("min Capacity: "+minCapacity);
        }
    }

    //Phuong thuc get size tra ve so luong phan tu
    public int size(){
        return size;
    }

    //Phuong thuc tra ve do dai cua Array list
    public int length(){
        return elements.length;
    }

    //Phuong thuc tra ve phan tu tai vi tri index
    public E get(int index){
        return (E) elements[index];
    }

    //Phuong thuc add phan tu vao cuoi ArrayList
    public boolean add(E e){
        if(size==elements.length){
            ensureCapacity(1);
        }
        elements[size]=e;
        size++;
        return true;
    }

    //Chen vao vi tri bat ky tai index mong muon
    public void add(E e,int index){
        if(index>elements.length){
            throw new IllegalArgumentException("Loi Index: "+index);
        }else if (elements.length==index+1){
            ensureCapacity(1);
        }
        if (elements[index]==null){
            size++;
            elements[index]=e;
        }else {
            if(size== elements.length){
                ensureCapacity(1);
            }
            System.arraycopy(elements,index,elements,index+1,size-index);
            elements[index]=e;
            size++;
        }
    }

    //Xoa 1 phan tu tai vi tri index
    public E remove(int index){
        if(index<0 || index >elements.length ){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element= (E) elements[index];
        for(int i=index;i<size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

    // tao ra mot ban sao
    public MyArrayList<E> clone(){
        MyArrayList<E> v =new MyArrayList<>();
        v.elements=Arrays.copyOf(elements,size);
        v.size=size;
        return v;
    }

    //tra ve vi tri mot phan tu trong mang Array List
    public int indexOf(E e){
        int index=-1;
        for(int i=0;i<size;i++){
            if(this.elements[i].equals(e)){
                index=i;
                break;
            }
        }
        return index;
    }

    //phuong thuc kiem tra phan tu co ton tai hay ko
    public boolean contains(E e){
        return this.indexOf(e)>=0;
    }

    //Phuong thuc xoa toan bo phan tu
    public void clear(){
        size=0;
        for(int i=0;i<elements.length;i++){
            elements[i]=null;
        }
    }
}
