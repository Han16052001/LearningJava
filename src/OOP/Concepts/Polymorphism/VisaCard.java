package OOP.Concepts.Polymorphism;

public class VisaCard implements PaymentGateway{

    @Override
    public void payment() {
        System.out.println("Payment with visa card");
    }
}
