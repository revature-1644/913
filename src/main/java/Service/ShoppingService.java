package Service;

public class ShoppingService {

    CustomerService customerService;
    InventoryService inventoryService;

    public ShoppingService(CustomerService customerService, InventoryService inventoryService){
        this.customerService = customerService;
        this.inventoryService = inventoryService;
    }

    public String produceShoppingResultMessage(String username, String product){
        boolean userExists = customerService.isUser(username);
        boolean productExists = inventoryService.doesItemExist(product);

        try {
            String retrievedProduct = inventoryService.getItem(product);
        }catch(Exception e){
            return "we don't have that product";
        }

        if(userExists){
            if(productExists){
                return "thanks for buying "+product+", "+username;
            }else{
                return "we don't have that product";
            }
        }else{
            return "you are not a user, please register";
        }
    }
}
