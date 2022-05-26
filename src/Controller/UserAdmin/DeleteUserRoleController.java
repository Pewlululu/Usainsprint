package Controller.UserAdmin;

import model.Role;

public class DeleteUserRoleController {

    public String Rname;

    public void deleteUserRoleController() {

        Role.delete(Rname);

    }

}
