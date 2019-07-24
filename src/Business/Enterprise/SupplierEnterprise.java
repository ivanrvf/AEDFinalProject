/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Role.Role;
import Business.SupplierDirectory.Supplier;
import Business.SupplierDirectory.SupplierDirectory;
import java.util.ArrayList;

/**
 *
 * @author ivanr
 */
public class SupplierEnterprise extends Enterprise{

    private SupplierDirectory supplierDirectory;
    public SupplierEnterprise(String name){
        super(name, EnterpriseType.SupplierEnterprise);
        supplierDirectory = new SupplierDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }
    //Remove this function 
    
    public Supplier getSupplierBySupplierName(Supplier supplier){
        for(Supplier supply: supplierDirectory.getSupplierList()){
            if(supply.getSupplierName().equalsIgnoreCase(supplier.getSupplierName())){
                return supply;
            }
        }
        return null;
    }

    /*  Get all related Organization    */
    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new SupplierOrganization());
        return organizationList;
    }
    
    public SupplierOrganization getOrganization(SupplierOrganization organization){
        for(Organization org: this.getOrganization()){
            if(org instanceof SupplierOrganization && organization.getName().equals(org.getName())){
                return (SupplierOrganization)org;
            }
        }
        return null;
    }
}
