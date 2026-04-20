package FactoryMethod;

public class ProductFactory {
    public static Product createProduct(String type, String name, double price){
        if(type.equalsIgnoreCase("BOOK")){
            return new Book(name, price);
        }
        else if(type.equalsIgnoreCase("ELECTRONICS")){
            return new Electronics(name, price);
        }
        else if(type.equalsIgnoreCase("FURNITURE")){
            new Furniture(name, price);
        }
        throw new IllegalArgumentException("Nezinoma produkto kategorija");
    }
}
