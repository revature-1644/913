public class ShoppingService {
    CustomerService customerService;
    InventoryService inventoryService;
    public ShoppingService(CustomerService customerService, InventoryService inventoryService){
        this.customerService = customerService;
        this.inventoryService = inventoryService;
    }
}
