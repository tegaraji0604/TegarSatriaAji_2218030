/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4_Enkapsulasi;

/**
 *
 * @author teguh
 */
public class HitungLimas {
    private double LuasAlas;
    public double Tinggi;
    double volume;

    public HitungLimas(){
    LuasAlas = 20;
    Tinggi = 6;
    volume = 3;
    
}
    
    public double getLuasAlas(){
        return LuasAlas;
        
    }
    
    public void setLuasAlas(double LuasAlas){
        this.LuasAlas = LuasAlas;
    }
    
    double VolumeLimas(){
        volume = (getLuasAlas()*Tinggi) /3;
        return volume;
    }
    
}
