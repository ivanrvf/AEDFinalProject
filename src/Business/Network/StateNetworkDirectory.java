/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class StateNetworkDirectory {
    
    private ArrayList<StateNetwork> stateList;

    public StateNetworkDirectory() {
        stateList = new ArrayList<>();
    }

    public ArrayList<StateNetwork> getStateList() {
        return stateList;
    }
    
    public StateNetwork createAndAddStateNetwork(){
    StateNetwork stateNetwork = new StateNetwork();
    stateList.add(stateNetwork);
    return stateNetwork;
    }
    
    public void removeStateNetwork(StateNetwork stateNetwork){
    
    stateList.remove(stateNetwork);
    }
    
    
    
    
}
