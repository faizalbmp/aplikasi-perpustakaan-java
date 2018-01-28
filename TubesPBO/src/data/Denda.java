/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;
import java.util.Date;
/**
 *
 * @author user
 */
public class Denda {
    
    private String idDenda;
    private java.util.Date tglKembali;
    private int jmlDenda;

    public int getJmlDenda() {
        return jmlDenda;
    }

    public void setJmlDenda(int jmlDenda) {
        this.jmlDenda = jmlDenda;
    }
    
    public String getIdDenda() {
        return idDenda;
    }

    public void setIdDenda(String idDenda) {
        this.idDenda = idDenda;
    }

}
