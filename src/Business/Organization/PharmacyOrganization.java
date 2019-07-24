/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.InventoryCatalog.InventoryCatalog;
import Business.Role.CDCManagerRole;
import Business.Role.PharmacyManagerRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class PharmacyOrganization extends Organization{
    
    private InventoryCatalog inventoryCatalog;
    
    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
        inventoryCatalog = new InventoryCatalog();
    }

    public InventoryCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmacyManagerRole());
        return roles;
    }
}
