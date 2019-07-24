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
public class StateHealthDeptEnterprise extends Enterprise{

    public StateHealthDeptEnterprise(String name) {
        super(name, EnterpriseType.StateHealthDepartment);
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
