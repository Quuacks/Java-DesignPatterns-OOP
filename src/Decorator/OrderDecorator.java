package Decorator;

public abstract class OrderDecorator implements Order{
    protected Order decoratedOrder;
    public OrderDecorator(Order order) {
        this.decoratedOrder = order;
    }
}
