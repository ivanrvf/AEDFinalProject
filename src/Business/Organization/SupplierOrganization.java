/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.InventoryCatalog.InventoryCatalog;
import Business.InventoryCatalog.InventoryItem;
import Business.Role.Role;
import Business.Role.SupplierRole;
import Business.VaccineCatalog.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author ivanr
 */
public class SupplierOrganization extends Organization{

    private InventoryCatalog vaccineStocksAvailable;
    
    public SupplierOrganization(){
        super(Organization.Type.Supplier.getValue());
        vaccineStocksAvailable = new InventoryCatalog();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
    
    public void addStock(Vaccine vaccine, int quantity){
        InventoryItem vaccineStock = new InventoryItem(vaccine, quantity);
        this.vaccineStocksAvailable.getInventoryList().add(vaccineStock);
    }

    public ArrayList<InventoryItem> getVaccineStocksAvailable() {
        return vaccineStocksAvailable.getInventoryList();
    }
    
    public InventoryCatalog getVaccineStock(){
        return vaccineStocksAvailable;
    }
    @Override
    public String toString(){
        return this.getName();
    }
}
