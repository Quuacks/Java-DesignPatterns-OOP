package FactoryMethod;

public class Furniture extends Product{
    public Furniture(String name, double price){
        super(name, price);
    }

    @Override
    public void getDetails(){
        System.out.println("Furniture: " + getName() + " | Price: " + getPrice());
    }
}
