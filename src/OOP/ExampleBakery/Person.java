package OOP.ExampleBakery;

public class Person {
    /*
    AccessModifier:
    Private: In class
    Default: In package
    Protected: Outside package but only access by child class
    Public: Outside package
     */

    //This is Attribute(Thuoc tinh) = Variable
    private String name;
    private int age;
    private Flour flour;

    //This is behavior= method = Function
    public void makeBakery(Flour flour){
        System.out.println(getName()+" is making bakery with "+flour.getName());
    }


    //Here ara constructors, constructor is a special method
    public Person(){} //Default constructor defined by system, don need parameter
    public Person(String name, int age){ //Constructor defined by user, you can add some parameter in it
        this.name=name;
        this.age=age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
