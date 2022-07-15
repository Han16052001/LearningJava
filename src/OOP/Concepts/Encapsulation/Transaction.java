package OOP.Concepts.Encapsulation;

public class Transaction {

    //Nen doi pucblic sang private de bao mat du lieu
    //private double transactionFee=0.01;
    public double transactionFee=0.01;

    public double getMoneyInMonth(int moneyTransfer){
        return moneyTransfer* transactionFee;
    }
}
