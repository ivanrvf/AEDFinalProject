/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class CDCEnterprise extends Enterprise{

    public CDCEnterprise(String name) {
        super(name, EnterpriseType.CDC);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        return null;
    }
}
