/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.DiseaseCatalog.Disease;

/**
 *
 * @author Varun
 */
public class Patient {
    private String name;
    private int age;
    private Disease disease;
    private String bloodGroup;

    public Patient() {
    disease = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    
    
    @Override
    public String toString(){
    return name;
    }
    
    
    
}
