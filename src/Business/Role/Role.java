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
import javax.swing.JPanel;

/**
 *
 * @author Varun
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        InvetoryManager("Inventory Manager"),
        LogisticsManager("Logistics Manager"),
        PharmacyManager("Pharmacy Manager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            StateNetwork network, 
            CountryNetwork countryNetwork,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}