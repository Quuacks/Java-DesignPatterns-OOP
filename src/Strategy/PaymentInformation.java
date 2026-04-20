package Strategy;

public class PaymentInformation {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        paymentStrategy.pay(amount);
    }
}
