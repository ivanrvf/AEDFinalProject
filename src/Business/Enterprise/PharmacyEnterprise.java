/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class PharmacyEnterprise extends Enterprise{

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
    ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new PharmacyOrganization());    
        
        return null;
    }
}
