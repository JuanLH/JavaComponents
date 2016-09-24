/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JLabel;

/**
 *
 * @author juanlht
 */
public class jlLabel extends JLabel {
    
    public jlLabel(){
        this("JLabel");
    }
    
    
    
    public jlLabel(String txt) {
        super(txt);
        init();
    }
    
    private void init(){
         this.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
    }
}
