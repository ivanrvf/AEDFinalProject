/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Enterprise.StateHealthDeptEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivanr
 */
public class CountryNetwork extends Network{
    private List<StateNetwork> stateNetworkList;
    
    public CountryNetwork(){
        stateNetworkList = new ArrayList<>();
    }

    public List<StateNetwork> getStateNetwork() {
        return stateNetworkList;
    }
    
    public StateNetwork addStateNetwork(){
        StateNetwork stateNetwork = new StateNetwork();
        stateNetworkList.add(stateNetwork);
        return stateNetwork;
    }
    
    public void removeState(StateNetwork stateNetwork){
        stateNetworkList.remove(stateNetwork);
    }
    
    public List<HospitalEnterprise> getAllHospitalEnterprisesFromAllStates(){
        List<HospitalEnterprise> hospitalEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            hospitalEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getHospitalEnterprise());
        }
        return hospitalEnterpriseList;
    }
    
    public List<StateHealthDeptEnterprise> getAllStateHealthEnterprisesFromAllStates(){
        List<StateHealthDeptEnterprise> stateHealthDeptEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            stateHealthDeptEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getStateHealthDeptEnterprise());
        }
        return stateHealthDeptEnterpriseList;
    }
    public List<SupplierEnterprise> getAllSupplierEnterprisesFromAllStates(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            supplierEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getSupplierEnterprise());
        }
        return supplierEnterpriseList;
    }
    public List<CDCEnterprise> getAllCDCEnterprisesFromAllStates(){
        List<CDCEnterprise> cdcEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            cdcEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getCDCEnterprise());
        }
        return cdcEnterpriseList;
    }
    
    public List<PharmacyEnterprise> getAllPharmacyEnterpriseFromAllStates(){
        List<PharmacyEnterprise> pharmacyEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            pharmacyEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getPharmacyEnterprise());
        }
        return pharmacyEnterpriseList;
    }
    
    public List<DistributorEnterprise> getAllDistributorEnterpriseFromAllStates(){
        List<DistributorEnterprise> distributorEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            distributorEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getDistributorEnterprise());
        }
        return distributorEnterpriseList;
    }
    
    public List<TravelAgencyEnterprise> getAllTravelAgencyEnterpriseFromAllStates(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(StateNetwork stateNetwork: this.getStateNetwork()){
            travelAgencyEnterpriseList.addAll(stateNetwork.getEnterpriseDirectory().getTravelAgencyEnterprise());
        }
        return travelAgencyEnterpriseList;
    }
}
