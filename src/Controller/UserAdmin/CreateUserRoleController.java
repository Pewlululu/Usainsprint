package Controller.UserAdmin;

import model.Role;

public class CreateUserRoleController {

    public String Name;
    public String Checknames;

    public void createUserRoleController() {
        Role role = new Role();
        role.setRoleName(Name);
        role.add(role);
    }

    public boolean CheckName() {
        boolean C = Role.isUserRoleTaken(Checknames);
        return C;
    }
}
