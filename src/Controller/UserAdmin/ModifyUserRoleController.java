package Controller.UserAdmin;

import model.Role;

public class ModifyUserRoleController {

    public int Rid;
    public String Rname;

    public void modifyUserRoleController() {
        Role role = new Role();
        role.setRoleId(Rid);
        role.setRoleName(Rname);
        role.modify(role);

    }
}
