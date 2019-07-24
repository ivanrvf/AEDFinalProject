/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InventoryCatalog;

import Business.VaccineCatalog.Vaccine;

/**
 *
 * @author Varun
 */
public class InventoryItem {
    private Vaccine vaccine;
    //private date expiryDate;
    private int quantity;
    private static int count = 0; 
    private int itemId;

    public InventoryItem(Vaccine vaccine, int quantity) {
        this.vaccine = vaccine;
        this.quantity = quantity;
        this. itemId = ++count;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    @Override
    public String toString(){
        return this.getVaccine().getName();
    }
    
    public boolean checkQuantity(int qty){
        boolean value = false;
        if(this.quantity >= qty){
            value = true;
        }
        return value;
    }
}
