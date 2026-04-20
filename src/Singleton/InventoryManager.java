package Singleton;

import FactoryMethod.Product;
import Observer.ProductObserver;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private static InventoryManager instance;

    public List<Product> stock = new ArrayList<>();

    private InventoryManager() {}

    public static synchronized InventoryManager getInstance(){
        if(instance == null)
            instance = new InventoryManager();
        return instance;
    }


    public void addToStock(Product newProduct, ProductObserver observer) {
        stock.add(newProduct);
        observer.notifyObservers(newProduct);
    }
    public void getStock() {
        for(Product product : stock){
            product.getDetails();
        }
    }

}
