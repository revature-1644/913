import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InventoryService {
    /**
     * Class-scoped object will make my items available to the inventoryService Object
     */
    List<String> items;

    /**
     * A constructor that initialized the List as an ArrayList
     */
    public InventoryService(){
        items = new ArrayList<>();
    }
//    method overloading - same method name, different method parameters
    public InventoryService(List<String> premadeItemsList){
        items = premadeItemsList;
    }

    /**
     * @return my list of items
     */
    public List<String> getAllItems(){
        return items;
    }

    /**
     * insert a new item into the list
     * @param newItem
     */
    public void addItem(String newItem){
        items.add(newItem);
    }

    /**
     * return true if item exists in items, false otherwise
     * @param name
     * @return
     */
    public boolean doesItemExist(String name){
        boolean b = items.contains(name);
        return b;
    }
}
