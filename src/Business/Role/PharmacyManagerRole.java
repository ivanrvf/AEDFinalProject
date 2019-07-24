/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Pharmacy.WorkAreaJPanel;

/**
 *
 * @author Varun
 */
public class PharmacyManagerRole extends Role{

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        return new WorkAreaJPanel(userProcessContainer, account, (PharmacyOrganization)organization, (PharmacyEnterprise)enterprise, network, countryNetwork, business);
    }
    
    
}
