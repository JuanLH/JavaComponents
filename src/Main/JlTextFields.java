/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author juanlht
 */
public class JlTextFields extends JTextField implements KeyListener{
    
    private KindTextField kind;

    public KindTextField getKind() {
        return kind;
    }

    public void setKind(KindTextField kind) {
        this.kind = kind;
    }
    
    
    
    public JlTextFields(){
        this("");
    }
    
    
    
    public JlTextFields(String txt) {
        super(txt);
        addKeyListener(this);
        init();
    }
    
    private void init(){
        this.setText("");
        this.setBackground(new java.awt.Color(238, 238, 80));
        this.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        this.setKind(KindTextField.ONLYUPPER);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //printEventInfo("Key Typed", ke);
        Character c = ke.getKeyChar();
        
        switch(kind){
            case ONLYUPPER :
                if(!c.isUpperCase(c)){
                    c = Character.toUpperCase(c);
                    ke.setKeyChar(c);
                }
            break;
            case TELEPHONE:
                if(!(c.isDigit(c) || c == 45)){
                    ke.consume();
                }
            break;  
            case FREESTYLE:
            break;
            case ONLYLOWER:
                if(!c.isLowerCase(c)){
                    c = Character.toLowerCase(c);
                    ke.setKeyChar(c);
                }
            break;
            case NUMBER:
                if(!c.isDigit(c)){
                    ke.consume();
                }
            break;
        }
         
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //printEventInfo("Key Pressed", ke);

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //printEventInfo("Key Released", ke);
    }
    
    private void printEventInfo(String str, KeyEvent e) {
 
        System.out.println(str);
        int code = e.getKeyCode();
        System.out.println("   Code: " + KeyEvent.getKeyText(code));
        System.out.println("   Char: " + e.getKeyChar());
        int mods = e.getModifiersEx();
        System.out.println("    Mods: "+ KeyEvent.getModifiersExText(mods));
        System.out.println("    Location: "+ keyboardLocation(e.getKeyLocation()));
        System.out.println("    Action? " + e.isActionKey());
    }
    
    private String keyboardLocation(int keybrd) {

        switch (keybrd) {

            case KeyEvent.KEY_LOCATION_RIGHT:
            return "Right";
            case KeyEvent.KEY_LOCATION_LEFT:
            return "Left";
            case KeyEvent.KEY_LOCATION_NUMPAD:
            return "NumPad";
            case KeyEvent.KEY_LOCATION_STANDARD:
            return "Standard";
            case KeyEvent.KEY_LOCATION_UNKNOWN:
            default:
            return "Unknown";
        }    
    }


}

 
