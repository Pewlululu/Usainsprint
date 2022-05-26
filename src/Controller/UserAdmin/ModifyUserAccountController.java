package Controller.UserAdmin;

import model.Account;

public class ModifyUserAccountController {

    public int Id;
    public String Username;
    public String Password;
    public String Name;
    public String Email;
    public String Status;
    public String Roles;
    public String Phone;

    public void modifyAccountController() {
        Account account = new Account();
        account.setAccId(Id);
        account.setAccUsername(Username);
        account.setAccPassword(Password);
        account.setAccName(Name);
        account.setAccEmail(Email);
        account.setStatus(Status);
        account.setAccRole(Roles);
        account.setAccPhone(Phone);
        account.modify(account);
    }

}
