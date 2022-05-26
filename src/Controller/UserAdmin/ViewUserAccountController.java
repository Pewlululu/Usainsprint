package Controller.UserAdmin;

import java.util.ArrayList;
import java.util.Iterator;
import model.Account;
import model.Role;

public class ViewUserAccountController {

    public static Iterator<Account> getAlldata() {
        ArrayList<Account> list2 = Account.getAllRecords();
        Iterator<Account> allacc2 = list2.iterator();

        return allacc2;

    }

    public static Iterator<Role> getAllRoles() {
        ArrayList<Role> list = Role.getAllRecords();
        Iterator<Role> allacc = list.iterator();

        return allacc;

    }
}
