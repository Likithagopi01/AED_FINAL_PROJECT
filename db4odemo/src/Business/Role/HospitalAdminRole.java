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
import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.HospitalAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

public class HospitalAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer,business,account);
    }

    
}
