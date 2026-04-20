package Decorator;

import FactoryMethod.Product;

public class BasicOrder implements Order{
    Product product;
    public BasicOrder(Product product){
        this.product = product;
    }

    public double getCost(){
        return product.getPrice() + 15.0;
    }
    public String getDescription(){
        return product.getName() + " Paprastas Uzsakymas";
    }
}
