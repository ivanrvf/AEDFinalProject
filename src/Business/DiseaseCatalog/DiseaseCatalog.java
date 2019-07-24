/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseCatalog;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class DiseaseCatalog {
    private ArrayList<Disease> diseaseList;

    public DiseaseCatalog() {
    diseaseList = new ArrayList<>();
    
    }
    
    public Disease addNewDisease(String diseaseName){
    Disease disease = new Disease(diseaseName);
    diseaseList.add(disease);
    return disease;
    
    }
    
    public void removeDisease(Disease disease){
    diseaseList.remove(disease);
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }
    
    
}
