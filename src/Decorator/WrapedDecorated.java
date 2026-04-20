package Decorator;

public class WrapedDecorated extends OrderDecorator{
    public WrapedDecorated(Order order){
        super(order);
    }

    public double getCost(){
        return decoratedOrder.getCost() + 5.0;
    }
    public String getDescription(){
        return decoratedOrder.getDescription() + " + Pakavimas";
    }
}
