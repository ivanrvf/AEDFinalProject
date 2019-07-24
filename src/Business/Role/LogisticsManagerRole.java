/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.LogisticsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Logistics.LogisticsManagerWorkAreaJPanel;

/**
 *
 * @author Varun
 */
public class LogisticsManagerRole extends Role{

    private String name = "Logistics Manager";
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        LogisticsOrganization org = (LogisticsOrganization)organization;
            return new LogisticsManagerWorkAreaJPanel(userProcessContainer, account, (LogisticsOrganization)org, (TravelAgencyEnterprise)enterprise, network, business);
        }
    
    @Override
    public String toString(){
    return name;
    
    }
}
