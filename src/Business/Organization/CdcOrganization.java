/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCManagerRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class CdcOrganization extends Organization{

    public CdcOrganization() {
        super(Organization.Type.CDC.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCManagerRole());
        roles.add(new SupplierRole());
        return roles;
    }
     
   
    
    
}
