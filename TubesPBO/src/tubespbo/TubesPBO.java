/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubespbo;
import data.Anggota;
import gui.LogiinGUI;

/**
 *
 * @author user
 */
public class TubesPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogiinGUI l = new LogiinGUI();
        l.setVisible(true);
        Anggota a1 = new Anggota();
        System.out.println(a1.getIdAnggota());
    }
    
}
