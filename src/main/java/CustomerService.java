import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerService {
    List<String> customers;

    /**
     * no-args constructor that instantiates the customers list
     */
    public CustomerService(){
        customers = new ArrayList<>();
    }

    /**
     * overloading constructor method
     * @param items
     */
    public CustomerService(List<String> items){
        customers = items;
    }

    /**
     * add a user to the customers
     * @param user
     */
    public void addUser(String user){
        customers.add(user);
    }

    /**
     * check if the user exists
     * @param user
     * @return
     */
    public boolean isUser(String user){
        return customers.contains(user);
    }
}
