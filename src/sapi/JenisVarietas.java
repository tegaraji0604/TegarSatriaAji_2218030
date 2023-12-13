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
public class JenisVarietas extends sapi implements Diskon{
    String NamaVarietas; 
    public String Berat;
    private String  Asal;
    int Harga,total,ongkir,jarak,berapaEkor;
    
    void dataNamaVarietas(String nama){
        this.NamaVarietas = nama;
       
    }
    void dataBerat (String berat){
        this.Berat = berat;
       
    }
    void dataAsal(String asal){
        this.Asal = asal;
       
    }
    void dataHarga(int harga){
    this.Harga = harga ;
       
    }
    void dataVarietas(String Varietas ){
    this.varietas = Varietas ;
       
    }
    
    
    public String getNamaVarietas(){
        return NamaVarietas; 
    } 
    public String getBerat(){
        return Berat; 
    } 
    public String getAsal(){
        return Asal; 
    }
    public String getVarietas() {
        return varietas;
    }
    
   int getOngkir(){
        return ongkir;
    }
   public int getBerapaSapi(){
        return berapaEkor;
    }
     
   
    // Metode override untuk getCetakHarga 
    @Override
    public int getCetakHarga(){
        return harga;
    }
    
    public int getTotalHarga(){
        int total;
       return total = getCetakHarga() * getBerapaSapi();
    }
    
     // Metode override untuk getCetakHarga 
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