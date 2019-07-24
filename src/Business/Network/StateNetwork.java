/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.SupplierDirectory.SupplierDirectory;

/**
 *
 * @author Varun
 */
public class StateNetwork extends Network{
    private EnterpriseDirectory enterpriseDirectory;
    
    public StateNetwork(){
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
}
