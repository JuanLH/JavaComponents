/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JPasswordField;

/**
 *
 * @author juanlht
 */
public class JlPastwordField extends JPasswordField {
    
    public JlPastwordField(){
        this("");
    }
    
    
    
    public JlPastwordField(String txt) {
        super(txt);
        init();
    }
    
    private void init(){
        this.setText("");
        this.setBackground(new java.awt.Color(238, 238, 80));
        this.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
       
    }
}
