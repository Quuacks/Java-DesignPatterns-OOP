import Decorator.BasicOrder;
import Decorator.Order;
import Decorator.WrapedDecorated;
import FactoryMethod.Product;
import FactoryMethod.ProductFactory;
import Observer.Customer;
import Observer.ProductObserver;
import Singleton.InventoryManager;

public class Main{
    public static void main(String[] args) {
        InventoryManager inventoryManager = InventoryManager.getInstance();

        ProductObserver shopNotifications = new ProductObserver();
        shopNotifications.subscribe(new Customer("Radzis"));

        Product book = ProductFactory.createProduct("book", "Lord of the rings", 15.99);
        inventoryManager.addToStock(book, shopNotifications);

        Order myOrder = new BasicOrder(book);
        myOrder = new WrapedDecorated(myOrder);
        System.out.println("Uzsakymas " + myOrder.getDescription() + " | Kaina: " + myOrder.getCost());
    }
}
