package OOP.Concepts.Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = null;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your payment here: ");
        String inputString= scanner.nextLine();

        if(inputString.equals("Visa")){
            paymentGateway = new VisaCard();
        }else if (inputString.equals("Local")){
            paymentGateway = new LocalCard();
        }else if (inputString.equals("Amx")) {
            paymentGateway= new AmxCard();
        }

        paymentGateway.payment();

    }
}
