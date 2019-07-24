/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderQueue;

import Business.CoOrdinates.Coordinates;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Patient.Patient;
import Business.SupplierDirectory.Supplier;
import Business.Transport.ModeOfTransport;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.Vaccine;
import java.util.Date;

/**
 *
 * @author Varun
 */
public class OrderRequest {

    
    
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Supplier supplier;
    private OrderRequest newOrderRequest;
    private Coordinates sourceCoordinates;
    private Coordinates destinationCoordinates;
    private ModeOfTransport modeOfTransport;
    private double dist;
    private int ETA;
    private SupplierOrganization supplierOrganization;
    private SupplierEnterprise supplierEnterprise;
    private Organization.Type type;
    private Patient patient;
    private Vaccine vaccine;
    private int quantity;
    private static int count = 0;
    private int orderId;
    
    
    public OrderRequest(){
        requestDate = new Date();
        newOrderRequest = null;
        count++;
        orderId = count;
        
    }

    public void setResolveDate(){
    
    resolveDate = new Date();
    }
    
    
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public OrderRequest getNewOrderRequest() {
        return newOrderRequest;
        
    }
//    
//    public void assignOrderRequest(OrderRequest orderRequest){
//        OrderRequest request = this.getLastOrderRequest();
//        request.newOrderRequest = request;
//    }
//    
//    public OrderRequest getLastOrderRequest(){
//        OrderRequest nOR = this.getNewOrderRequest();
//        while(nOR!=null){
//            nOR = nOR.getLastOrderRequest();
//        }
//    return nOR;
//    
//    }

    public int getOrderId() {
        return orderId;
    }
    
     
    public OrderRequest createAndGetNewOrderRequest() {
        if (newOrderRequest==null){
        newOrderRequest = new OrderRequest() {};
        
        }
        return newOrderRequest;
    }
    public OrderRequest getLastOrderRequest(){
        OrderRequest nOR = this;
        while(nOR.getNewOrderRequest()!=null){
            nOR = nOR.getNewOrderRequest();
        }
        return nOR;
    
    }

    public Coordinates getSourceCoordinates() {
        return sourceCoordinates;
    }

    public void setSourceCoordinates(Coordinates sourceCoordinates) {
        this.sourceCoordinates = sourceCoordinates;
    }

    public Coordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public void setDestinationCoordinates(Coordinates destinationCoordinates) {
        this.destinationCoordinates = destinationCoordinates;
    }

    public ModeOfTransport getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(ModeOfTransport modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public double getDist() {
        return dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public int getETA() {
        return ETA;
    }

    public void setETA(int ETA) {
        this.ETA = ETA;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SupplierOrganization getSupplierOrganization() {
        return supplierOrganization;
    }

    public void setSupplierOrganization(SupplierOrganization supplierOrganization) {
        this.supplierOrganization = supplierOrganization;
    }

    public SupplierEnterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(SupplierEnterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public Organization.Type getType() {
        return type;
    }

    public void setType(Organization.Type type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return this.sender.getUsername();
    }
}
