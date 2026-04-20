package Singleton;

public class InventoryManager {
    private static InventoryManager instance;

    private InventoryManager() {}

    public static synchronized InventoryManager getInstance(){
        if(instance == null)
            instance = new InventoryManager();
        return instance;
    }

    public void addToStock() {}
    public void getStock() {}

}
