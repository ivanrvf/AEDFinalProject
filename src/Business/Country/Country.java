/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.StateHealthDeptEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.StateNetwork;
import Business.Network.StateNetworkDirectory;
import Business.State.StateDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rohan
 */
public class Country {
    
    private String name;
    private StateNetworkDirectory stateNetworkDirectory;

    public Country(String name) {
        this.name = name;
        stateNetworkDirectory = new StateNetworkDirectory();
        
    }

    public StateNetworkDirectory getStateNetworkDirectory() {
        return stateNetworkDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
    return name;
    }
    
    
}
