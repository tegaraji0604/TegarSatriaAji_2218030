/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2_Konstruktor;

/**
 *
 * @author teguh
 */
public class Main {
    public static void main(String[]args){
        Kendaraan mobil = new Kendaraan();
        
System.out.println("Nama Kendaraan 10 + "+mobil.nama);
System.out.println("Warna Kendaraan : + "+mobil.warna);
System.out.println("Pabrikan Kendaraan : " + mobil. pabrikan);
System.out.println("Kecepatan maximal: " + mobil. speed + "km/jam \n");
System.out.println("Cara kendaraan bergerak : ");
System.out.print("Saat maju : ");
mobil.KendaraanMaju();
System.out.print("Saat mundur: ");
mobil.KendaraanMundur();
System.out.print("Saat berhenti : ");
mobil.KendaraanBerhenti();
    } 
}
