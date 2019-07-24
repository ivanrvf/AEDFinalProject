/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.CoOrdinates.Coordinates;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.OrderQueue.OrderQueue;
import Business.OrderQueue.OrderRequest;
import Business.Patient.Patient;
import Business.Transport.ModeOfTransport;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public abstract class Organization {

    private String name;
    private OrderQueue orderQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private Coordinates coordinates;
    
    public enum Type{
        Admin("Admin Organization"),
        Clinic("Clinic Organization"),
        Inventory("Inventory Organization"),
        CDC("CDC Management Organization"),
        SHD("SHD Management Organization"),
        Supplier("Supplier Organization"),
        Logistics("Logistics Organization"),
        Pharmacy("Pharmacy Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        orderQueue = new OrderQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        coordinates = new Coordinates();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public OrderQueue getOrderQueue() {
        return orderQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderQueue(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    public void createEmergencyRequest(String username, String password, Employee emp, Role role, UserAccount userAccount, Patient patient, Vaccine vaccine){
        UserAccount account = this.userAccountDirectory.createUserAccount(username, password, emp, role);
        OrderRequest orderRequest = account.getOrderQueue().addOrderRequest();
        orderRequest.setPatient(patient);
        orderRequest.setStatus(name);
        orderRequest.setSender(userAccount);
        orderRequest.setVaccine(vaccine);
    }
}
