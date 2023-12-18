/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbab10;

/**
 *
 * @author AXIOO
 */
public class TiketKeretaApi extends TiketOnline {
    // Atribut tambahan untuk TiketKeretaApi
    private String nomorKereta;

    public void setNomorKereta(String nomorKereta) {
        this.nomorKereta = nomorKereta;
    }

    public String getNomorKereta() {
        return nomorKereta;
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

    // Konstruktor TiketKeretaApi
    public TiketKeretaApi(String datadirianda, String alamatAsal, String tujuan, String nomorKereta) {
        super(datadirianda, alamatAsal, tujuan);//suoer digunakan untuk memanggil methode/atribut/konstruktor pada induk class
        this.nomorKereta = nomorKereta;
    }

    // Method tambahan untuk TiketKeretaApi
    public String cetakNomorKereta() {
        return nomorKereta;
    }
}
    

