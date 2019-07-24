/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CoOrdinates;

/**
 *
 * @author Varun
 */
public class Coordinates {
   
    double latitude;
    double longitude;

    public Coordinates() {
    
    }

    

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setCoordinates(String latitude, String longitude) {
        this.latitude = Double.parseDouble(latitude);
        this.longitude = Double.parseDouble(longitude);
    
    }
}
