package Service;

import java.util.ArrayList;
import java.util.List;
import Exception.NoProductFoundException;
import Model.Inventory;
import Util.LogUtil;

public class InventoryService {
    /**
     * Class-scoped object will make my items available to the inventoryService Object
     */
    List<Inventory> items;

    /**
     * A constructor that initialized the List as an ArrayList
     */
    public InventoryService(){
        items = new ArrayList<>();
        LogUtil.log.info("Setting up inventory service");
    }
//    method overloading - same method name, different method parameters
    public InventoryService(List<Inventory> premadeItemsList){
        items = premadeItemsList;
    }

    /**
     * @return my list of items
     */
    public List<Inventory> getAllItems(){
        LogUtil.log.info("getting all items");
        return items;

    }

    /**
     * insert a new item into the list
     * @param newItem
     */
    public void addItem(Inventory newItem){
        items.add(newItem);
        LogUtil.log.info("Adding item");
    }

    /**
     * return true if item exists in items, false otherwise
     * @param name
     * @return
     */
    public boolean doesItemExist(String name){
        LogUtil.log.info("Searching if item exists : "+ name);
        if(findItemByName(name)==null){
            return false;
        }else{
            return true;
        }
    }

    public Inventory findItemByName(String name){
        for(Inventory item : items){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public String getItem(String name) throws Exception {
        if(doesItemExist(name)){
            return name;
        }else{
            throw new NoProductFoundException();
        }
    }
}
