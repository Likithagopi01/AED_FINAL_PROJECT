/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author Ash
 */
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.VoluntaryAdmin.VoluntaryJPanel;

public class VoluntaryAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new VoluntaryJPanel(userProcessContainer, business,account);
    }
    
    
}