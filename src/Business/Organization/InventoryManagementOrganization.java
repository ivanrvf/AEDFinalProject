/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.InventoryCatalog.InventoryCatalog;
import Business.Role.DistributorInventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class InventoryManagementOrganization extends Organization{
    
    private InventoryCatalog inventoryCatalog;
    public InventoryManagementOrganization() {
        
        super(Organization.Type.Inventory.getValue());
        inventoryCatalog = new InventoryCatalog();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorInventoryManagerRole());
        return roles;
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public void setInventoryCatalog(InventoryCatalog inventoryCatalog) {
        this.inventoryCatalog = inventoryCatalog;
    }
    
}