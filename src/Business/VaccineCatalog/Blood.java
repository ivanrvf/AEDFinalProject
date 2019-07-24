/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineCatalog;

import Business.DiseaseCatalog.Disease;

/**
 *
 * @author Varun
 */
public class Blood extends Vaccine{
    
    public Blood(String name, Disease diseaseProtectedAgainst) {
        super(name, diseaseProtectedAgainst);
    }
    
}
