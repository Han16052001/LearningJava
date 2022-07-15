package OOP.Concepts.Polymorphism;

public class LocalCard implements PaymentGateway{

    @Override
    public void payment() {
        System.out.println("Payment with local Card");
    }
}
