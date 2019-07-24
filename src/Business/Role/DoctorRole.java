/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Doctor.DoctorWorkAreaJPanel;

/**
 *
 * @author Varun
 */
public class DoctorRole extends Role{

    private String name = "Doctor";
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,StateNetwork network, CountryNetwork countryNetwork, EcoSystem business) {
        ClinicOrganization org = (ClinicOrganization) organization;
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise)enterprise;
         return new DoctorWorkAreaJPanel(userProcessContainer, account, org, hospitalEnterprise, network, business);
        }
    
    @Override
    public String toString(){
    return name;
    
    }
}
