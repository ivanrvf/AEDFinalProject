/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
    patientList = new ArrayList<>();
    }
    
    public Patient addNewPatient(){
    Patient patient = new Patient();
    patientList.add(patient);
    return patient;
    
    }
    
    public void removePatient(Patient patient){
    patientList.remove(patient);
    
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    
    
    
    
    
}
