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
public class Vaccine {
    String name;
    Disease diseaseProtectedAgainst;

    public Vaccine(String name, Disease diseaseProtectedAgainst) {
        this.name = name;
        this.diseaseProtectedAgainst = diseaseProtectedAgainst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disease getDiseaseProtectedAgainst() {
        return diseaseProtectedAgainst;
    }

    public void setDiseaseProtectedAgainst(Disease diseaseProtectedAgainst) {
        this.diseaseProtectedAgainst = diseaseProtectedAgainst;
    }
    
    @Override
    public String toString(){
    return name;
    }
    
    
}
