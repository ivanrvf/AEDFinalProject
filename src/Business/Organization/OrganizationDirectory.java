/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDC.getValue())){
            organization = new CdcOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SHD.getValue())){
            organization = new SHDOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Logistics.getValue())){
            organization = new LogisticsOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}