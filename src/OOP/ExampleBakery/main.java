package OOP.ExampleBakery;

public class main {
    public static void main(String[] args) {
        //This is an object
        Person person= new Person();
        person.setName("Robert");
        person.setAge(20);

        //You can create much more one object by change it name
        Person person1= new Person();

        Flour flour=new Flour();
        flour.setName("cornstarch");
        flour.setWeight(2);

        person.makeBakery(flour);
    }
}
