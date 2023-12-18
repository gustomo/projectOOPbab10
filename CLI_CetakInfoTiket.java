/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopbab10;

/**
 *
 * @author AXIOO
 */
public class CLI_CetakInfoTiket {
   /* public static void main(String[] args) {
        TiketOnline kereta = new TiketOnline("singasari", "singasari", "surabaya, kediri");

        System.out.println("Pemesanan tiket online");
        System.out.println("----------------------");

        System.out.println("Data diri anda : " + kereta.cetakdataDirianda());
        System.out.println("Alamat asal : " + kereta.cetakAlamat());

        System.out.print("Lihat tujuan yang tersedia\nDaftar pemberhentian :\n" + kereta.cetaktujuan());*/
        
        public static void main(String[] args) {
        TiketOnline tiket = new TiketOnline("John Doe", "Jakarta", "Bali");
        // Memanggil versi pertama metode dataDirianda
        tiket.dataDirianda("Jane Doe");
        System.out.println(tiket.cetakdataDirianda());

        // Memanggil versi kedua metode dataDirianda
        tiket.dataDirianda("John", "Doe");
        System.out.println(tiket.cetakdataDirianda());
        }
    }
    
   





