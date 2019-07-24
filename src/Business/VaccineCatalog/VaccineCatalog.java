/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineCatalog;

import Business.DiseaseCatalog.Disease;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class VaccineCatalog {
    
    ArrayList<Vaccine> vaccineList;

    public VaccineCatalog() {
    vaccineList = new ArrayList<>();
    
    }
    
    public void addNewVaccine(String vaccineName, Disease disease){
    Vaccine vaccine = new Vaccine(vaccineName, disease);
    vaccineList.add(vaccine);
    //return vaccine;
    }
    
    public void removeVaccine(Vaccine vaccine){
    vaccineList.remove(vaccine);
    
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
}
