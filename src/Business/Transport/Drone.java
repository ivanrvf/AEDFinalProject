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
public class Drone extends ModeOfTransport{
    
    private int speed;
    
    public Drone() {
        super(ModeOfTransport.Type.Drone.getValue());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    
}
