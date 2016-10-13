/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author juanlht
 */
public class JlComboBox extends JComboBox {
    private Connection conn;
    

    public JlComboBox() {
        this(null, null, null);
    }

    public JlComboBox(Connection conn, String table, String column) {
        this.conn = conn;
       
        init();
    }
    
    
    private void init (){
        this.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
    }
    
    public void closeConn() throws SQLException {
        conn.close();
        conn = null;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    
     public void fillCombo(String column , String table) throws SQLException
    {   
         try 
         {
            Statement comando = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = comando.executeQuery("Select "+column+" from "+table+";");
            while(rs.next()){
                this.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
           // Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            throw new SQLException(ex);
            //System.err.println("** Error de Base de datos en el select **\n"+ex.getMessage());
            //return null;
        }
    }
        
}
