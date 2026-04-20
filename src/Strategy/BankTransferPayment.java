package Strategy;

public class BankTransferPayment implements PaymentStrategy {
    public void pay(double amount){
        System.out.println("Sumoketa: " + amount + " Bankiniu pervedimu");
    }
}
