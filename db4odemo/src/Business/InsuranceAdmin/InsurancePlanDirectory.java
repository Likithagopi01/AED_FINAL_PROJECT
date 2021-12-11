/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceAdmin;

import java.util.ArrayList;

/**
 *
 * @author Mudit Mathur
 */
public class InsurancePlanDirectory {
    ArrayList<InsurancePlan> ipDirectory = new ArrayList<>();

    public ArrayList<InsurancePlan> getIpDirectory() {
        return ipDirectory;
    }

    public void setIpDirectory(ArrayList<InsurancePlan> ipDirectory) {
        this.ipDirectory = ipDirectory;
    }
    
    public void addPlan(InsurancePlan ip){
        ipDirectory.add(ip);
    }
     public void deleteInsuranceCompany(InsurancePlan ic){
        ipDirectory.remove(ic);
    }
}
