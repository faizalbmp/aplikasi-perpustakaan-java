package data;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Pengembalian extends Anggota{
    
    private String idKembali = "1101314000";
    private String tglKembali;
    private String idAnggota;
    private String idBuku;
    private String idPinjam;
    private int statusDenda = 1;
    private int jumlahDenda = 0;

    private String tglPinjam;

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public int getStatusDenda() {
        return statusDenda;
    }

    public void setStatusDenda(int statusDenda) {
        this.statusDenda = statusDenda;
    }

    public int hitungDenda(String p,String k){
        if (statusDenda ==1){
            int tahunP = Integer.parseInt(p.substring(6, 10));
        int hariP = Integer.parseInt(p.substring(0, 2));
        int bulanP = Integer.parseInt(p.substring(3, 5) );
        int tahunk = Integer.parseInt(k.substring(6, 10));
        int harik = Integer.parseInt(k.substring(0, 2));
        int bulank = Integer.parseInt(k.substring(3, 5) );
        statusDenda = harik - hariP;
        statusDenda = (bulank - bulanP)*30+statusDenda;
        statusDenda = (tahunk - tahunP)*365+statusDenda;
        if (statusDenda>3){
            this.jumlahDenda = statusDenda;
            statusDenda = 1;
            jumlahDenda = jumlahDenda *jumlahDenda*1000000;
        }else{
            statusDenda = 0;
        }
        }
        return jumlahDenda;
    }
    public String getIdPinjam() {
        return idPinjam;
    }

    public void setIdPinjam(String idPinjam) {
        this.idPinjam = idPinjam;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }
    
    public int getJumlahDenda(){
        return jumlahDenda;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

  
    public String getTglKembali() {
        return tglKembali;
    }
    
    public void updatePengembalian(){
        Database db = new Database();
        String query = "update pengembalian set statusDenda= 1 where idPengembalian='"+idKembali+"'";
        db.query(query);
    }

    public void setTglKembali() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.tglKembali = sdf.format(cal.getTime());
    }

    public String getIdKembali() {
        return idKembali;
    }

    public void setIdKembali(String idKembali) {
        this.idKembali = idKembali;
    }
    
    
    
    public void savePengembalian(){
        Database db = new Database();
        String s ="insert into pengembalian values('"+this.idKembali+"','"+this.tglKembali+"','"+this.idPinjam+"',"+this.statusDenda+")";
        db.query(s);
    }
    
    public ResultSet getPengembalian(){
        ResultSet result = null;
        Database db = new Database();
        String s ="insert into anggota values('"+this.idKembali+"','"+this.tglKembali+"')";
        db.query(s);
        return result;
    }
}
