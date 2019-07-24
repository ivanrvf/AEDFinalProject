/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SHDManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class SHDOrganization extends Organization{

    public SHDOrganization() {
        super(Organization.Type.SHD.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SHDManagerRole());
        return roles;
    }
     
   
    
    
}
