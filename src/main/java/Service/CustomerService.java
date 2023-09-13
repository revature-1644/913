package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerService {
    List<Customer> customers;

    /**
     * no-args constructor that instantiates the customers list
     */
    public CustomerService(){
        customers = new ArrayList<>();
//        Integer is a wrapper class, which allows us to convert from primitive to object for use in generic types
//        Java will automatically convert from wrapper to primitive and reverse (autoboxing/autounboxing)
//        List<Integer> ints = new ArrayList<>();
    }

    /**
     * overloading constructor method
     * @param items
     */
    public CustomerService(List<Customer> items){
        customers = items;
    }

    /**
     * add a user to the customers
     * @param user
     */
    public void addUser(Customer user){
        customers.add(user);
    }

    /**
     * check if the user exists
     * @param user
     * @return
     */
    public boolean isUser(Customer user){

        return customers.contains(user);
    }

    /**
     * check if the user exists, by name
     * @param name
     * @return
     */
    public boolean isUser(String name){
        Customer c = searchByUsername(name);
        if(c == null){
            return false;
        }else{
            return true;
        }
    }

    public Customer searchByUsername(String username){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(username)){
                return customers.get(i);
            }
        }
        return null;
    }
}
