/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ranranhe
 */
public class VitalSignHistory {

    private ArrayList<VitalSigns> vitalSignHistory;
        private double min;
    private double max;

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    public VitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return this.vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> history) {
        this.vitalSignHistory = history;
    }

    public void addVital(VitalSigns v) {
        vitalSignHistory.add(v);
    }

    public void deleteVital(VitalSigns v) {
        vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double max, double min) {
       ArrayList<VitalSigns> list = new ArrayList<VitalSigns>();
    for (VitalSigns vs : this.getVitalSignHistory())
    {
    if(vs.getBloodPressure() < min || vs.getBloodPressure() > max)
    {
       list.add(vs);
    }
     }
    return list;
    }

    
}
