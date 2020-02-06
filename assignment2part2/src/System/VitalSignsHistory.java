/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.util.ArrayList;

/**
 *
 * @author Swati
 */
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignhistory;
     
     public VitalSignsHistory(){
         this.vitalSignhistory = new ArrayList<VitalSigns>();
     }

    public ArrayList<VitalSigns> getVitalSignhistory() {
        return vitalSignhistory;
    }

    public void setVitalSignhistory(ArrayList<VitalSigns> vitalSignhistory) {
        this.vitalSignhistory = vitalSignhistory;
    }

     public void addVital(VitalSigns v) {
        vitalSignhistory.add(v);
    }
    
        
}
    

