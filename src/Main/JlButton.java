/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author juanlht
 */
public class JlButton extends JButton implements MouseListener{
    
    boolean  click = false;
    boolean hover = false;

    public JlButton(){
        this("JLButton");
    }
    
    
    
    public JlButton(String txt) {
        super(txt);
        init();
    }
    
    private void init(){
        addMouseListener(this);
        //this.setBackground(new java.awt.Color(238, 238, 80));//yellow
        //this.setBackground(new java.awt.Color(238, 131, 80));//lima
        this.setFont(new java.awt.Font("TlwgMono", 1, 18)); // NOI18N
        this.setForeground(new java.awt.Color(16, 6, 6));
    }

     @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        click = true;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        click = false;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        hover = true;
    }

    @Override
    public void mouseExited(MouseEvent me) {
        hover = false;
    }
    
    
   
    
}
