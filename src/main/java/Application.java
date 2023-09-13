import Model.Customer;
import Model.Inventory;
import Service.CustomerService;
import Service.InventoryService;
import Service.ShoppingService;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        InventoryService inventoryService = new InventoryService();
        ShoppingService shoppingService = new ShoppingService(customerService, inventoryService);
        Inventory i1 = new Inventory("shirt", 19.99);
        Inventory i2 = new Inventory("pants", 19.99);
        Inventory i3 = new Inventory("tie", 19.99);
        Inventory i4 = new Inventory("blouse", 19.99);
        Inventory i5 = new Inventory("skirt", 19.99);
        inventoryService.addItem(i1);
        inventoryService.addItem(i2);
        inventoryService.addItem(i3);
        inventoryService.addItem(i4);
        inventoryService.addItem(i5);

        while(true){
            System.out.println("Please enter your desired action (purchase/view/add account): ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("purchase")){
                System.out.println("please input username: ");
                String username = sc.nextLine();
                System.out.println("please input desired product: ");
                String product = sc.nextLine();
                String resultMessage = shoppingService.produceShoppingResultMessage(username, product);
                System.out.println(resultMessage);
//                first, ask the user who they are
//                then, check if the product exists
//                if it exists, send some output telling the user if purchase successful
            }else if(input.equals("view")){
                List<Inventory> items = inventoryService.getAllItems();
                System.out.println(items);
//                retrieve all the products
//                send some output displaying them
            }else if(input.equals("add account")){
//                ask the user who they are
//                add their user to the customerservice
                System.out.println("please input username: ");
                String username = sc.nextLine();
                Customer customer = new Customer(username, "some email @ email.com");
                customerService.addUser(customer);
            }
        }
    }
}
