package FactoryMethod;

public class Electronics extends Product{
    public Electronics(String name, double price){
        super(name, price);
    }

    @Override
    public void getDetails(){
        System.out.println("Electronics: " + getName() + " | Price: " + getPrice());
    }
}
