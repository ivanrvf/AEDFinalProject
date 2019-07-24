/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierDirectory;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
    supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    public Supplier addNewSupplier(String supplierName){
        Supplier supplier = new Supplier(supplierName);
        supplierList.add(supplier);
        return supplier;
    
    } 
    
    public void removeSupplier(Supplier supplier){
    supplierList.remove(supplier);
    
    }
    
    
}
