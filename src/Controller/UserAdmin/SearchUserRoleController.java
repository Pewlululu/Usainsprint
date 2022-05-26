package Controller.UserAdmin;

import java.util.ArrayList;
import java.util.Iterator;
import model.Role;

public class SearchUserRoleController {

    public String txtinput;

    public Iterator<Role> Search() {
        ArrayList<Role> list = Role.Search(txtinput);
        Iterator<Role> itr = list.iterator();
        return itr;
    }
}
