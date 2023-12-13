/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapi;

/**
 *
 * @author teguh
 */
public class Pembeli extends sapi implements Diskon{
   String namaPembeli;
   private String kota;
   public int berapaEkor,total;
   int ongkir,jarak;
    void dataNamaPembeli(String Pembeli){
        this.namaPembeli = Pembeli;
    }
    
    void dataKota(String Kota){
        this.kota = Kota;
    }
    
    void dataBerapaEkor(int Ekor){
        this.berapaEkor = Ekor;
    }
    
    void dataHarga(int harga){
        this.total = harga;
    }
     void dataTotal(int Total){
        this.total = Total;
    }
    void dataOngkir (int ongkir){
        this.ongkir = ongkir;
    }
    
    String getNamaPembeli(){
        return namaPembeli;
    }
    
    String getKota(){
        return kota;
    }
    
    public int getBerapaSapi(){
        return berapaEkor;
    }
    
    int getOngkir(){
        return ongkir;
    }
    
    // Metode override untuk getCetakHarga 
    @Override
    public int getCetakHarga(){
        return harga;
    }
    
    public int getTotalHarga(){
       return total = getCetakHarga() * getBerapaSapi();
    }
    
    
    
//    @Override
//    public int getHargaSapi(){
//        switch (jeniskelamin){
//            case "Jantan":
//            return 80000;
//            case "Betina":
//            return 50000;
//            default :
//                return 0;
//        }
//    }
    
    public int getOngkir (int jarak){
        return ongkir + (jarak * 10000); 
    }
    
    
 @Override
    public int hitungDiskon(){
        int hargaSapi = getCetakHarga();      
        int totalHarga = (hargaSapi * berapaEkor) + getOngkir(jarak);
        int diskon = (int) (totalHarga * 0.3) ;
        return diskon;
    }
    
    @Override
    public int hitungTotalHarga(){
        int hargaSapi = getCetakHarga();
         int totalHarga = (hargaSapi * berapaEkor) - hitungDiskon()+ getOngkir(jarak);
         return total;
    }

    
}

