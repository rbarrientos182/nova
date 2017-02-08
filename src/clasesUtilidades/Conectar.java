/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesUtilidades;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author rbarrientos
 */
public class Conectar {
    Connection conect = null;
    public Connection conexion(){
        
        try{
           
           //Cargamos el Driver MySQL
           Class.forName("com.mysql.jdbc.Driver");
           //conect = DriverManager.getConnection("jdbc:mysql://localhost:8889/nova","nova","nova");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/nova","nova","nova");
           //JOptionPane.showMessageDialog(null, "conectado");
           //Cargamos el Driver Access
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           //Conectar en red base 
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=//servidor/bd_cw/cw.mdb";
           //Conectar Localmente
           //String strConect = "jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ=D:/cwnetbeans/cw.mdb";
          //conect = DriverManager.getConnection(strConect,"",""); 
            
        } catch(ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null,"Error "+e);
            
        }
        return conect;
    }
    
}
