package Observer;

import FactoryMethod.Product;

public class Customer implements Observer{
    private String name;
    public Customer(String name){
        this.name = name;
    }

    public void update(Product product){
        System.out.println("Pranesimas klientui " + name + ": Nauja preke: " + product.getName() + " | Kaina: " + product.getPrice());
    }
}
