package Business;

import Business.DiseaseCatalog.DiseaseCatalog;
import Business.Enterprise.CDCEnterprise;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Enterprise.StateHealthDeptEnterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Enterprise.TravelAgencyEnterprise;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.OrderQueue.OrderQueue;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.VaccineCatalog.VaccineCatalog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Varun
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
   // private ArrayList<StateNetwork> networkList;
    private DiseaseCatalog diseaseCatalog;
    private VaccineCatalog vaccineCatalog;
    private ArrayList<CountryNetwork> countryList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        //networkList = new ArrayList<>();
        countryList = new ArrayList<>();
        diseaseCatalog = new DiseaseCatalog();
        vaccineCatalog = new VaccineCatalog();
    }

   /* public ArrayList<StateNetwork> getNetworkList() {
        return networkList;
    }

    public StateNetwork createAndAddNetwork() {
        StateNetwork network = new StateNetwork();
        networkList.add(network);
        return network;
    }*/

    public ArrayList<CountryNetwork> getCountryList() {
        return countryList;
    }

    public CountryNetwork createAndAddCountry(String name) {
        CountryNetwork country = new CountryNetwork();
        country.setName(name);
        countryList.add(country);
        return country;
    }

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
    
    public List<HospitalEnterprise> getAllHospitalEnterprisesFromAllCountries(){
        List<HospitalEnterprise> hospitalEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            hospitalEnterpriseList.addAll(countryNetwork.getAllHospitalEnterprisesFromAllStates());
        }
        return hospitalEnterpriseList;
    }
    
    public List<StateHealthDeptEnterprise> getAllStateHealthEnterprisesFromAllCountries(){
        List<StateHealthDeptEnterprise> stateHealthDeptEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            stateHealthDeptEnterpriseList.addAll(countryNetwork.getAllStateHealthEnterprisesFromAllStates());
        }
        return stateHealthDeptEnterpriseList;
    }
    
    public List<SupplierEnterprise> getSupplierEnterprisesFromAllCountries(){
        List<SupplierEnterprise> supplierEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            supplierEnterpriseList.addAll(countryNetwork.getAllSupplierEnterprisesFromAllStates());
        }
        return supplierEnterpriseList;
    }
    public List<CDCEnterprise> getCDCEnterprisesFromAllCountries(){
        List<CDCEnterprise> cdcEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            cdcEnterpriseList.addAll(countryNetwork.getAllCDCEnterprisesFromAllStates());
        }
        return cdcEnterpriseList;
    }
    
    public List<PharmacyEnterprise> getPharmacyEnterprisesFromAllCountries(){
        List<PharmacyEnterprise> pharmacyEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            pharmacyEnterpriseList.addAll(countryNetwork.getAllPharmacyEnterpriseFromAllStates());
        }
        return pharmacyEnterpriseList;
    }
    
    public List<DistributorEnterprise> getDistributorEnterpriseFromAllCountries(){
        List<DistributorEnterprise> distributorEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            distributorEnterpriseList.addAll(countryNetwork.getAllDistributorEnterpriseFromAllStates());
        }
        return distributorEnterpriseList;
    }
    
    /* Get All Request */
    
    public OrderQueue getAllDistributorEnterpriseOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(DistributorEnterprise distributorEnterprise: this.getDistributorEnterpriseFromAllCountries()){
            orderQueue.getOrderRequestList().addAll(distributorEnterprise.getOrderQueue().getOrderRequestList());
        }
        return orderQueue;
    }
    
    public OrderQueue getAllPharmacyEnterprisesOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(PharmacyEnterprise pharmacyEnterprise: this.getPharmacyEnterprisesFromAllCountries()){
            orderQueue.getOrderRequestList().addAll(pharmacyEnterprise.getOrderQueue().getOrderRequestList());
        }
        return orderQueue;
    }
    
    public List<TravelAgencyEnterprise> getAllTravelAgencyEnterprisesFromAllCountries(){
        List<TravelAgencyEnterprise> travelAgencyEnterpriseList = new ArrayList<>();
        for(CountryNetwork countryNetwork: this.countryList){
            travelAgencyEnterpriseList.addAll(countryNetwork.getAllTravelAgencyEnterpriseFromAllStates());
        }
        return travelAgencyEnterpriseList;
    }
    
    public OrderQueue getAllTravelAgencyEnterpriseOrderRequestFromAllCountries(){
        OrderQueue orderQueue = new OrderQueue();
        for(TravelAgencyEnterprise travelAgencyEnterprise: this.getAllTravelAgencyEnterprisesFromAllCountries()){
            orderQueue.getOrderRequestList().addAll(travelAgencyEnterprise.getOrderQueue().getOrderRequestList());
        }
        return orderQueue;
    }
    
    public CountryNetwork getNetworkByUserAccount(UserAccount userAccount){
        for(CountryNetwork countrynetwork: this.getCountryList()){
            for(StateNetwork network: countrynetwork.getStateNetwork()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    for(UserAccount ua:enterprise.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getUsername().equalsIgnoreCase(userAccount.getUsername())){
                            return countrynetwork;
                        }
                    }
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                        for(UserAccount ua:organization.getUserAccountDirectory().getUserAccountList()){
                            if(ua.getUsername().equalsIgnoreCase(userAccount.getUsername())){
                                return countrynetwork;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    /*  END */
}