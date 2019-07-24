/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierDirectory;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.VaccineCatalog.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class Supplier{
    
    private String supplierName;
    
    private ArrayList<VaccineStock> vaccineStocksAvailable;

    public Supplier(String name) {
        this.supplierName = name;
        vaccineStocksAvailable = new ArrayList<>();
    }

    public void addStock(Vaccine vaccine, int quantity){
        VaccineStock vaccineStock = new VaccineStock(vaccine, quantity);
        vaccineStocksAvailable.add(vaccineStock);
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    

    public String getSupplierName() {
        return supplierName;
    }

    public ArrayList<VaccineStock> getVaccineStocksAvailable() {
        return vaccineStocksAvailable;
    }
    
    @Override
    public String toString(){
    return supplierName;
    }
    
    }
    

    
    

