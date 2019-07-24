/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import java.lang.reflect.Type;
import java.util.*;

/**
 *
 * @author Varun
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.StateHealthDepartment){
            enterprise = new StateHealthDeptEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.CDC){
            enterprise = new CDCEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.Distributor){
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.SupplierEnterprise){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Pharmacy){
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.TravelAgent){
            enterprise = new TravelAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    /*  Get all Enterprise list by their types  */
    public List<SupplierEnterprise> getSupplierEnterprise(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise: enterpriseList){
            if(enterprise instanceof SupplierEnterprise){
                supplierEnterpriseList.add((SupplierEnterprise)enterprise);
            }
        }
        return supplierEnterpriseList;
    }
    
    public List<HospitalEnterprise> getHospitalEnterprise(){
        List<HospitalEnterprise> hospitalEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise: enterpriseList){
            if(enterprise instanceof HospitalEnterprise){
                hospitalEnterpriseList.add((HospitalEnterprise)enterprise);
            }
        }
        return hospitalEnterpriseList;
    }
    
    public List<CDCEnterprise> getCDCEnterprise(){
        List<CDCEnterprise> cdcEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof CDCEnterprise){
                cdcEnterpriseList.add((CDCEnterprise) enterprise);
            }
        }
        return cdcEnterpriseList;
    }
    
    public List<StateHealthDeptEnterprise> getStateHealthDeptEnterprise(){
        List<StateHealthDeptEnterprise> stateHealthDeptEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof StateHealthDeptEnterprise){
                stateHealthDeptEnterpriseList.add((StateHealthDeptEnterprise) enterprise);
            }
        }
        return stateHealthDeptEnterpriseList;
    }
    
    /*  End */
    
    public void deleteEnterprise(Enterprise enterprise){
        this.enterpriseList.remove(enterprise);
    }
    
    public List<DistributorEnterprise> getDistributorEnterprise(){
        List<DistributorEnterprise> distributorEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof DistributorEnterprise){
                distributorEnterpriseList.add((DistributorEnterprise) enterprise);
            }
        }
        return distributorEnterpriseList;
    }
    
    public List<PharmacyEnterprise> getPharmacyEnterprise(){
        List<PharmacyEnterprise> pharmacyEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof DistributorEnterprise){
                pharmacyEnterpriseList.add((PharmacyEnterprise) enterprise);
            }
        }
        return pharmacyEnterpriseList;
    }
    
    public DistributorEnterprise getNearestDistributorEnterprise(){
        DistributorEnterprise distributorEnterprise = null;
        for(DistributorEnterprise row: this.getDistributorEnterprise()){
            
        }
        return distributorEnterprise;
    }
    
    public List<TravelAgencyEnterprise> getTravelAgencyEnterprise(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(Enterprise enterprise:enterpriseList){
            if(enterprise instanceof TravelAgencyEnterprise){
                travelAgencyEnterpriseList.add((TravelAgencyEnterprise) enterprise);
            }
        }
        return travelAgencyEnterpriseList;
    }
    
    
    
    public SupplierEnterprise supplierEnterpriseByOrganization(SupplierOrganization supplierOrganization){
        SupplierEnterprise mainSupplierEnterprise = null;
        for(SupplierEnterprise supplierEnterprise: this.getSupplierEnterprise()){
            for( Organization sup: supplierEnterprise.getOrganizationDirectory().getOrganizationList()){
                if(sup instanceof SupplierOrganization && sup.equals(supplierOrganization))
                    return mainSupplierEnterprise;
            }
        }
        return mainSupplierEnterprise;
    }
}
