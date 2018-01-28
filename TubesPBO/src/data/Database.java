/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Database {
    private String dbUser = "root";
    private String dbPass = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/TubesPBO",dbUser,dbPass);
            stmt = con.createStatement(); 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,""+ e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
