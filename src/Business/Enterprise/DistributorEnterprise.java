/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class DistributorEnterprise extends Enterprise{

    public DistributorEnterprise(String name) {
        super(name, EnterpriseType.Distributor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /*  Get all related organization    */
    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new InventoryManagementOrganization());
        return organizationList;
    }
}
