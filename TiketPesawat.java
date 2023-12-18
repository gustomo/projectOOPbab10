/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbab10;

/**
 *
 * @author AXIOO
 */
public class TiketPesawat extends TiketOnline {
     
    // Atribut tambahan untuk TiketPesawat
    private String nomorPenerbangan;

    public void setNomorPenerbangan(String nomorPenerbangan) {
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getDatadirianda() {
        return datadirianda;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setDatadirianda(String datadirianda) {
        this.datadirianda = datadirianda;
    }

    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    // Konstruktor TiketPesawat
    public TiketPesawat(String datadirianda, String alamatAsal, String tujuan, String nomorPenerbangan) {
        super(datadirianda, alamatAsal, tujuan);
        this.nomorPenerbangan = nomorPenerbangan;
    }

    // Method tambahan untuk TiketPesawat
    public String cetakNomorPenerbangan() {
        return nomorPenerbangan;
    }
}

