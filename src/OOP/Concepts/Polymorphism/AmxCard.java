package OOP.Concepts.Polymorphism;

public class AmxCard implements PaymentGateway{

    @Override
    public void payment() {
        System.out.println("Payment with Amx card");
    }
}
