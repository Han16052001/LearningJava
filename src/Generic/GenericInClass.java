package Generic;

public class GenericInClass<K,V>{
    private K key;
    private V value;

    public GenericInClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericInClass<Integer,String> map1= new GenericInClass(1,"One");
        GenericInClass<String,Integer> map2= new GenericInClass("Two",2);
        System.out.println(map1.getKey()+" "+map1.getValue());
        System.out.println(map2.getKey()+" "+map2.getValue());
    }
}
