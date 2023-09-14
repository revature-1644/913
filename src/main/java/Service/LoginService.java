package Service;

import Model.Customer;
import Model.Employee;
import Model.User;

public class LoginService {

    public LoginService(){

    }

    /**
     * if true, permit the login, if false, don't permit the login
     * @return
     */
    public boolean checkLogin(User u){
        if(u.getName().equals("user") && u.getPassword().equals("password")){
            return true;
        }
        return false;
    }

}
