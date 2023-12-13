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
public class Kendaraan {
    String nama,warna, pabrikan;
    int speed;
    
    public Kendaraan(){
    this.nama="Vios";
      this.warna="Silver";
        this.pabrikan="Toyota";
          this.speed=200;
          
}
    void KendaraanMaju(){
        System.out.println("Berjalan Maju");
    }
      void KendaraanMundur(){
        System.out.println("Berjalan Mundur");
        
    }
        void KendaraanBerhenti(){
        System.out.println("Berhenti");
    }
        
}
