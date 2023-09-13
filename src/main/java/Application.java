import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        InventoryService inventoryService = new InventoryService();
        inventoryService.addItem("shirt");
        inventoryService.addItem("pants");
        inventoryService.addItem("tie");
        inventoryService.addItem("blouse");
        inventoryService.addItem("skirt");

        while(true){
            System.out.println("Please enter your desired action (purchase/view/add account): ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("purchase")){
                System.out.println("please input username: ");
                String username = sc.nextLine();
                boolean isUser = customerService.isUser(username);
                if(isUser){
                    System.out.println("please input desired product: ");
                    String product = sc.nextLine();
                    boolean productExists = inventoryService.doesItemExist(product);
                    if(productExists){
                        System.out.println("thanks for buying the "+product+", "+username);
                    }
                }
//                first, ask the user who they are
//                then, check if the product exists
//                if it exists, send some output telling the user if purchase successful
            }else if(input.equals("view")){
                List<String> items = inventoryService.getAllItems();
                System.out.println(items);
//                retrieve all the products
//                send some output displaying them
            }else if(input.equals("add account")){
//                ask the user who they are
//                add their user to the customerservice
                System.out.println("please input username: ");
                String username = sc.nextLine();
                customerService.addUser(username);
            }
        }
    }
}
