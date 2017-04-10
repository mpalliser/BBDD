/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.enlaceDB;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
/**
 *
 * @author mpm
 */
public class ConexionMySQL {
    
    public String bd="personas";
    public String login="root";
    public String password="mpm";
    public String url="jdbc:mysql://localhost/"+bd;

    public Connection conectar(){
        Connection link=null;    
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link= (Connection) DriverManager.getConnection(this.url,this.login,this.password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     return link;   
    }
}