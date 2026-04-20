package Strategy;

import Decorator.Order;
import FactoryMethod.Product;

import java.util.ArrayList;
import java.util.List;

public class PaymentInformation {
    private PaymentStrategy paymentStrategy;
    private List<Order> bag = new ArrayList<>();
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(){
        double amount = 0.0;
        for(Order o : bag){
            amount += o.getCost();
        }
        paymentStrategy.pay(amount);
    }
    public void addProductToBag(Order order){
        bag.add(order);
    }
}
