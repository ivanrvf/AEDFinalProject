/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Rohan
 */
public class StateDirectory {
    private ArrayList<State> stateList;
    private EnterpriseDirectory enterpriseDirectory;

    public StateDirectory(){
    stateList = new ArrayList<>();
    enterpriseDirectory = new EnterpriseDirectory();
    }
    
    public State addState(String stateName){
    State state = new State(stateName);
    stateList.add(state);
    return state;
    
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    
    public void removeState(State city){
    stateList.remove(city);
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }
    
    
    
}
