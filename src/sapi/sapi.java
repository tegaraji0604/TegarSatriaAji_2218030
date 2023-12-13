/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teguh
 */
package sapi;

abstract public class sapi {
    String varietas;
    String lokasi;
    String umur;
    public String jeniskelamin;
    int harga;
    
    public sapi() {
        this.varietas = "Lokal";
        this.jeniskelamin = "Jantan";
        this.umur = "4 Tahun";
        this.lokasi = "Dalam Negeri";
    }

    
    
    public void setVarietas(String varietas) {
        this.varietas = varietas;
    }

   // Metode overloading untuk setUmur dengan tipe data int
    public void setUmur(String tahun) {
        this.umur = tahun + " Tahun";
    }

    public void setJenisKelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    public void setHarga (int harga){
        this.harga = harga;
    }
    
    
    public String getCetakVarietas() {
        return varietas;
    }

    public String getCetakUmur() {
        return umur;
    }

    public String getCetakJenisKelamin() {
        return jeniskelamin;
    }

    public String getCetakLokasi() {
        return lokasi;
    }
    
    
//    public int getCetakHarga (){
//       return harga;
//       
//    }
    public abstract int getCetakHarga(); 
    public abstract int hitungTotalHarga();
//public abstract int getHargaSapi();
    
}