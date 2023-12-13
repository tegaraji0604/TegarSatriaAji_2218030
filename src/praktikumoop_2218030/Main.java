/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumoop_2218030;

/**
 *
 * @author teguh
 */
public class Main {
    
    public static void main(String[] args) { 
    Kendaraan mobil = new Kendaraan();
    mobil.nama= "Mobil";
    mobil.warna= "Merah";
    mobil.merk ="Toyota";
    System.out.println("Nama Kendaraan " + mobil.nama);
    System.out.println("Warna Kendaraan : "+ mobil.warna);
    System.out.println("Merek Kendaraan : "+ mobil.merk);
    System.out.println("Jumlah Roda"+ mobil.jmlroda (4) + "\n");
    System.out.println("Cara kendaraan bergerak : ");
    System.out.print( "Saat maju: ");
    mobil. kendaraanMaju();
    System.out.print("Saat mundur: ");
    mobil.kendaraanMundur();
    System.out.print("Saat berhenti : "+ mobil.nama);
    mobil.kendaraanBerhenti();
}
    }

