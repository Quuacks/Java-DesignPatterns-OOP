package FactoryMethod;

public class Book extends Product{
    public Book(String name, double price){
        super(name, price);
    }

    @Override
    public void getDetails(){
        System.out.println("Knyga: " + getName() + " | Kaina: " + getPrice());
    }
}
