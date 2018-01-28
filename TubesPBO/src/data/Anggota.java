/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Anggota {
   
    private String idAnggota = "101314000";

    private String nama;

    private String alamat;

    private String telepon;
    
    private int jmlPinjam;
    
    private int jmlKembali;
    
    public Anggota() {
    }

    public Anggota(String idAnggota, String nama, String alamat, String telepon) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;    
    }
    public void saveAnggota(){
        Database db = new Database();
        String s ="insert into anggota values('"+this.idAnggota+"','"+this.nama+"','"+this.alamat+"','"+this.telepon+"')";
        db.query(s);
    }
    
    public ResultSet getAnggota(){
        ResultSet result = null;
        Database db = new Database();
        String s ="insert into anggota values ('"+this.idAnggota+"','"+this.nama+"','"+this.alamat+"','"+this.telepon+"')";
        db.query(s);
        return result;
    }

}
