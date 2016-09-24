/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.BorderLayout;
import javax.accessibility.Accessible;
import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 *
 * @author juanlht
 */
public class JLabelText extends JPanel implements Accessible{
     private JLabel etiqueta;//Etiqueta
     private JTextArea texto;//Area de Texto
     
     public JLabelText(){
         this("Campo","Valor");
     }
     
     public JLabelText(String etiqueta,String texto){
         this(new JLabel(etiqueta),new JTextArea(texto));
     }
     
     public JLabelText(JLabel etiqueta,JTextArea texto){
         super();
         this.setBorder(new BevelBorder(BevelBorder.RAISED));
         this.setLayout(new BorderLayout());
         this.add(etiqueta,BorderLayout.WEST);
         this.add(texto,BorderLayout.CENTER);
         this.repaint();
     }
     
     public void setText(String text){
         etiqueta.setText(text);
     }

    
}


