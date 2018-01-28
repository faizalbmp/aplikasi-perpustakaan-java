/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author user
 */
public class Peminjaman {
    
    
    private String idPinjam = "10000000";
    private String idAnggota;
    private String idBuku;
    private String tglPinjam;
    private String statusPeminjaman;
    
    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }


    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.tglPinjam = sdf.format(cal.getTime());
    }

    public String getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }
    

    
    public void savePeminjaman(){
        Database db = new Database();
        String s ="insert into peminjaman values('"+this.idPinjam+"','"+this.tglPinjam+"','"+this.idAnggota+"','"+this.idBuku+"'"+")";
        db.query(s);
    }
    
}
