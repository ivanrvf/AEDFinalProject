/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class HospitalEnterprise extends Enterprise{

    private PatientDirectory patientDirectory;
    
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        patientDirectory = new PatientDirectory();
    }
    
    

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Organization> getOrganization() {
        ArrayList<Organization> organizationList = new ArrayList<>();
        organizationList.add(new ClinicOrganization());
        return null;
    }
    
}
