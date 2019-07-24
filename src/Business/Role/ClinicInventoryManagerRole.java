/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClinicManagerRole.ClinicInventoryManagerWorkAreaJPanel;

/**
 *
 * @author Varun
 */
public class ClinicInventoryManagerRole extends Role{

    private String name = "Clinic Inventory Manager";
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        ClinicOrganization org = (ClinicOrganization) organization;
        return new ClinicInventoryManagerWorkAreaJPanel(userProcessContainer, account, org, enterprise, network, business.getVaccineCatalog(), business.getDiseaseCatalog());
    }
    
    @Override
    public String toString(){
    return name;
    
    }
}
