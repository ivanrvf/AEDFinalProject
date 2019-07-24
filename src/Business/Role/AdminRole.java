/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
return new AdminWorkAreaJPanel(userProcessContainer, enterprise, account, network);
    }

    
    
}
