package Collection.ArrayList;

public class TestMyArrayList {
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person) obj).name) && this.age==((Person) obj).age;
        }
    }

    public static void main(String[] args) {
        MyArrayList<Person> myArrayList= new MyArrayList<>(5);
        myArrayList.ensureCapacity(4);

        myArrayList.add(new Person("Nguyen",30));
        myArrayList.add(new Person("Vu",30));
        myArrayList.add(new Person("Bon",30));
   //     myArrayList.add(new Person("Bao",30),1);
     //   myArrayList.remove(2);

        MyArrayList<Person> list2 = myArrayList.clone();
//        for(int i=0;i<= myArrayList.size();i++){
//            System.out.println(myArrayList.get(i).toString());
//        }

        int index=list2.indexOf(new Person("Bon",30));
        System.out.println("index= "+index);

        for(int i=0;i<= list2.size();i++){
            System.out.println(myArrayList.get(i).toString());
        }
    }
}
