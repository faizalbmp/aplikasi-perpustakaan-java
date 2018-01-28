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
public class DataBuku {
    
    private String idBuku = "110131400";

    private String Judul;

    private String Pengarang;

    private String Penerbit;

    private int stokBuku;

    public int getStokBuku() {
        return stokBuku;
    }

    public void setStokBuku(int stokBuku) {
        this.stokBuku = stokBuku;
    }


    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

    public String getPengarang() {
        return Pengarang;
    }

    public void setPengarang(String Pengarang) {
        this.Pengarang = Pengarang;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }
    
    public void saveDataBuku(){
        Database db = new Database();
        String s ="insert into databuku values('"+this.idBuku+"','"+this.Judul+"','"+this.Pengarang+"','"+this.Penerbit+"',"+this.stokBuku+")";
        db.query(s);
    }
    
    public void updateDataBuku(){
        Database db = new Database();
        String query = "update databuku set judul='"+getJudul()+"',pengarang='"+getPengarang()+"',penerbit='"+getPenerbit()+"',stokBuku="+getStokBuku()+" where idBuku='"+idBuku+"'";
        db.query(query);
        
    }
    public void updateStokBuku(){
        Database db = new Database();
        String query = "update databuku set stokBuku="+getStokBuku()+" where idBuku='"+idBuku+"'";
        db.query(query);
        
    }
    
    
    public ResultSet getDataBuku(){
        ResultSet result = null;
        Database db = new Database();
        String s ="insert into databuku values('"+this.idBuku+"','"+this.Judul+"','"+this.Pengarang+"','"+this.Penerbit+"',"+this.stokBuku+")";
        db.query(s);
        return result;
    }

}
