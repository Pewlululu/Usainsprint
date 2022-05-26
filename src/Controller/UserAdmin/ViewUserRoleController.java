package Controller.UserAdmin;

import java.util.ArrayList;
import java.util.Iterator;
import model.Role;

public class ViewUserRoleController {

    public static Iterator<Role> getdata() {
        ArrayList<Role> arrayL = Role.getAllRecords();
        Iterator<Role> itr = arrayL.iterator();

        return itr;
    }

}
