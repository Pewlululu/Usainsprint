package Controller.UserAdmin;

import java.util.ArrayList;
import java.util.Iterator;
import model.Account;

public class SearchAccountController {

    public String txtinput;

    public Iterator<Account> Search() {
        ArrayList<Account> list = Account.Search(txtinput);
        Iterator<Account> itr = list.iterator();
        return itr;
    }
}
