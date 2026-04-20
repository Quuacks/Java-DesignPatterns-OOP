package Observer;

import FactoryMethod.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductObserver {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o){
        observers.add(o);
    }
    public void notifyObservers(Product product){
        for(Observer o : observers){
            o.update(product);
        }
    }
}
