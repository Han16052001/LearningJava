package Generic;

public class GenericInMethod {

    //Ky tu trong generic
    //    E- Element (Phần tử như Student , Teacher)
    //    K – Key (Giống như key trong tập hợp Map)
    //    V – Value (V là giá trị giống như kiểu Value trong M )
    //    N – Number (Kiểu số)
    //    T – Type (Loại đối tượng ví dụ như con chó , gà , mèo thuộc loại động vật)

    //Khong su dung generic
//    public static void printElements(Object[] objects){
//        for(Object o : objects){
//            System.out.println(o);
//        }
//        System.out.println();
//    }

    //Chuyen doi sang geniric
    public static <T> void printElements(T[] ts){
        for(T o : ts){
            System.out.println(o);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] integers= {1,2,3,4};
        Double[] doubles={1.0,2.0,3.0,4.0};
        String[] strings={"1","2","3","4"};
        printElements(integers);
        printElements(doubles);
        printElements(strings);

    }
}
