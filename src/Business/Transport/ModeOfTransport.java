/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

/**
 *
 * @author Varun
 */
public abstract class ModeOfTransport {
    
    private String name;
    private String id;
    private static int count = 0;
    private int range;
    private String status;
    public static Type test;
    
    public enum Type{
        
        Drone("Drone"),
        Ambulance("Ambulance");
        
        private String value;
        private Type(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public ModeOfTransport(String name) {
        this.name = name;
        count++;
        id=String.valueOf(count);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    public String toString(){
    return name;
    }
    
}
