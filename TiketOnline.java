/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbab10;

import javax.swing.JTextField;

/**
 *
 * @author AXIOO
 */

    public class TiketOnline  {
    // Atribut
    String datadirianda, alamatAsal, tujuan;
    

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
    
    // Konstruktor
    public TiketOnline(String datadirianda, String alamatAsal, String tujuan) {
        this.datadirianda = datadirianda;
        this.alamatAsal = alamatAsal;
        this.tujuan = tujuan;
        
        
    }

    // Method
    void dataDirianda(String datadirianda) {
        this.datadirianda = datadirianda;
    }
    
     

    // Overloading method 
    void dataDirianda(String namaDepan, String namaBelakang) {
        this.datadirianda = namaDepan + " " + namaBelakang;
    }
    

    void dataAlamat(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    String cetakdataDirianda() {
        return datadirianda;
    }

    String cetakAlamat() {
        return alamatAsal;
    }

    String cetaktujuan() {
        return tujuan;
    }
   
}






