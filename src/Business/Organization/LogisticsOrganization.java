/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Transport.TransportDirectory;
import Business.Role.LogisticsManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class LogisticsOrganization extends Organization{

    private TransportDirectory transportDirectory;
    
    
    public LogisticsOrganization() {
        super(Organization.Type.Logistics.getValue());
        transportDirectory = new TransportDirectory();
    }

    public TransportDirectory getTransportDirectory() {
        return transportDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LogisticsManagerRole());
        return roles;
    }
}
