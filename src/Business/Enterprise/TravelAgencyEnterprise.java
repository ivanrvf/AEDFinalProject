/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class TravelAgencyEnterprise extends Enterprise{

    public TravelAgencyEnterprise(String name) {
        super(name, EnterpriseType.TravelAgent);
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new LogisticsOrganization());
        return null;
    }
    
}
