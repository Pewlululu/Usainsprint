package Controller.UserAdmin;

import model.Account;

public class CreateUserAccountController {

    public String Username;
    public String Password;
    public String Name;
    public String Email;
    public String Status;
    public String Roles;
    public String Phone;
    public String Checknames;

    public void createAccountController() {

        Account account = new Account();
        account.setAccUsername(Username);
        account.setAccPassword(Password);
        account.setAccName(Name);
        account.setAccEmail(Email);
        account.setStatus(Status);
        account.setAccRole(Roles);
        account.setAccPhone(Phone);
        account.add(account);
    }

    public boolean CheckName() {
        boolean C = Account.isUsernameTaken(Checknames);
        return C;
    }
}
