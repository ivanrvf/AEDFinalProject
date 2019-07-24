/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.InventoryCatalog.InventoryCatalog;
import Business.Role.ClinicInventoryManagerRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class ClinicOrganization extends Organization{

    
    private InventoryCatalog inventoryCatalog;
    
    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
        inventoryCatalog = new InventoryCatalog();
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public void setInventoryCatalog(InventoryCatalog inventoryCatalog) {
        this.inventoryCatalog = inventoryCatalog;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicInventoryManagerRole());
        roles.add(new DoctorRole());
        return roles;
    }
     
}