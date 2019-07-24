/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryManager.DistributorInventoryManagerWorkAreaJPanel;

/**
 *
 * @author Varun
 */
public class DistributorInventoryManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        InventoryManagementOrganization org = (InventoryManagementOrganization)organization;
        return new DistributorInventoryManagerWorkAreaJPanel(userProcessContainer, account, org, (DistributorEnterprise)enterprise, network, countryNetwork, business);
    }
    
    
}
