package Controller.UserAdmin;

import model.Account;

public class DeleteUserAccountController {

    public String Name;

    public void deleteAccountController() {

        //Account acc =new Account();
        Account.delete(Name);
    }
}
