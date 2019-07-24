/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.OrderQueue.OrderRequest;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Distributor("Distributor"),
        CDC("CDC"),
        StateHealthDepartment("StateHealthDepartment"),
        SupplierEnterprise("Supplier"),
        TravelAgent("TravelAgent"),
        Pharmacy("Pharmacy");
        private String value;

        private EnterpriseType(String value) {
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

    public abstract ArrayList<Organization> getOrganization();
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public boolean approveOrganizationRequest(Type type, Enterprise sdphEnterprise, UserAccount userAccount){
        
        
        if (type.getValue().equals(Type.Supplier.getValue())){
            OrderRequest supplierOrganizationRequest = sdphEnterprise.getOrderQueue().addOrderRequest();
            supplierOrganizationRequest.setSender(userAccount);
            supplierOrganizationRequest.setSupplierEnterprise((SupplierEnterprise)this);
            supplierOrganizationRequest.setType(type);
            supplierOrganizationRequest.setStatus("Sent");
            return true;
        }
        return false;
    }
}
