/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

import Business.OrderQueue.OrderRequest;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Transport.ModeOfTransport.Type;
import Business.UserAccount.UserAccount;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Varun
 */
public class TransportDirectory {
    
    private ArrayList<ModeOfTransport> transportList;

    public TransportDirectory() {
    transportList = new ArrayList<>();
    }

    public ArrayList<ModeOfTransport> getTransportList() {
        return transportList;
    }
    
    public Type getTransportType(){
        return this.getTransportType();
    }
    
    public ModeOfTransport addTransport(Type type){
        ModeOfTransport modeOfTransport = null;
        if (type.getValue().equals(Type.Drone.getValue())){
            modeOfTransport = new Drone();
            transportList.add(modeOfTransport);
        }
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            modeOfTransport = new Ambulance();
            transportList.add(modeOfTransport);
        }
        return modeOfTransport;
    }
    
    
    // Check This if it works else create 2 objects
    public void removeTransport(ModeOfTransport transport){
    transportList.remove(transport);
    
    }
    
    public double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
      double theta = lon1 - lon2;
      double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
      dist = Math.acos(dist);
      dist = rad2deg(dist);
      dist = dist * 60 * 1.1515;
      if (unit == 'K') {
        dist = dist * 1.609344;
      } else if (unit == 'N') {
        dist = dist * 0.8684;
        }
      return (dist);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts decimal degrees to radians             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double deg2rad(double deg) {
      return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts radians to decimal degrees             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private double rad2deg(double rad) {
      return (rad * 180.0 / Math.PI);
    }

    private void showDistance(){
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'M') + " Miles\n");
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'K') + " Kilometers\n");
    System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'N') + " Nautical Miles\n");

    }
    
    public static Organization calculateShortestDistance(OrganizationDirectory organizationDirectory, OrderRequest orderRequest)throws Exception{
        String key ="AIzaSyAyiHM8SthFspcIXSblPCok9ee42wjxQms"; 
    StringBuffer urlString = new StringBuffer();
    //40.6905615%2C-73.9976592%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626&key="+key;
        urlString.append("https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins="+orderRequest.getDestinationCoordinates().getLatitude()+","+orderRequest.getDestinationCoordinates().getLongitude()+"&destinations=");
         
        double distanceList[] = new double[organizationDirectory.getOrganizationList().size()] ;
        int durationList[] = new int[organizationDirectory.getOrganizationList().size()] ;
        
        for(int i =0; i<organizationDirectory.getOrganizationList().size(); i++){
           Organization organization= organizationDirectory.getOrganizationList().get(i);
            urlString.append(organization.getCoordinates().getLatitude()+"%2C"+organization.getCoordinates().getLongitude()+"%7C");
    
    }
    
        urlString.substring(0, urlString.length()- 2);
        urlString.append("&key="+key);
        //System.out.println(urlString);
        
//    String key ="AIzaSyAyiHM8SthFspcIXSblPCok9ee42wjxQms"; 
//    String urlString = "https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=40.6655101,-73.8918896&destinations=40.6905615%2C-73.9976592%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626%7C40.659569%2C-73.933783%7C40.729029%2C-73.851524%7C40.6860072%2C-73.6334271%7C40.598566%2C-73.7527626&key="+key;
    
    URL url = new URL(urlString.toString());
        //URLConnection urlconn = url.openConnection();
        InputStreamReader in = null;
        StringBuilder sb = new StringBuilder();
        HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
        urlConn.setRequestMethod("GET");
        urlConn.connect();
//        urlconn.connect();
//        InputStream inputStream = urlconn.getInputStream();
         //= url.openStream();
        //System.out.println("Code: "+urlConn.getResponseCode());
        if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
                System.out.println(sb.toString()); 
                
     
               
JsonParser parser = new JsonParser(); 

JsonObject json = (JsonObject) parser.parse(sb.toString());

        JsonArray rows = json.getAsJsonArray("rows");
        
        Iterator <JsonElement> iterator1 = rows.iterator();
        Organization org = null;
         
    while (iterator1.hasNext()) {
        
        Object obj = iterator1.next();
        if(obj instanceof JsonObject) {
           JsonArray elements = ((JsonObject)obj).getAsJsonArray("elements"); 
        
           
         Iterator <JsonElement> iterator2 = elements.iterator();
         int i =0;
    while (iterator2.hasNext()) {
        
        JsonObject obj1 = (JsonObject)iterator2.next();
        if(obj1 instanceof JsonObject) {
            //JsonObject jsonObject = obj1.get("distance").getAsJsonObject();
            //System.out.println(jsonObject.get("text"));
            String dist = obj1.getAsJsonObject("distance").get("text").getAsString();
            String duration = obj1.getAsJsonObject("duration").get("text").getAsString();
            
      String numberPattern = "[^.0-9]";
      dist = dist.replaceAll(numberPattern,"");
      duration =duration.replaceAll("[^0-9]","");
      
          distanceList[i]=Double.parseDouble(dist);
          durationList[i]=Integer.parseInt(duration);
        System.out.println("\n Element: "+ i+ "\t"+" Distance: "+dist+"\t Duration: "+duration);
        }    
            
            
            
        
        i++;
    }
    
    double shortest = distanceList[0];
    int index = 0;
    for(int j= 1; j<distanceList.length; j++){
    if(shortest>distanceList[j]){
    shortest = distanceList[j];
    index = j;
    }
    
    }
    
    orderRequest.setETA(durationList[index]);
    orderRequest.setDist(shortest);
    org = organizationDirectory.getOrganizationList().get(index);    
    UserAccount u = org.getUserAccountDirectory().getUserAccountList().get(0);
    orderRequest.setReceiver(u);
    orderRequest.getLastOrderRequest().setReceiver(u);
        }
    }
        
        
        
        
    return org;
    
    }
}