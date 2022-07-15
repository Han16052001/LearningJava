package OOP.Concepts.Encapsulation;

public class TransactionHistory {

    public void saveTransactionHistory(){
        int moneyTransfer=1000000; //dau ra mong muon la 10000
        Transaction transaction=new Transaction();
        transaction.transactionFee=0.03; //o day truy cap dc toi transaction la ko bao toan tinh dong goi
        System.out.println(transaction.getMoneyInMonth(moneyTransfer));
    }

}
