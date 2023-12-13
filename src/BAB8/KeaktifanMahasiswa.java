/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1.Bab2.Bab3.Bab4.Bab5.Bab6.Bab7.Bab8;

import ProjectPraktikum.Bab1.Bab2.Bab3.Bab4.Bab5.Bab6.Bab7.*;
import ProjectPraktikum.Bab1.Bab2.Bab3.Bab4.Bab5.Bab6.*;

/**
 *
 * @author icornermalang
 */
public class KeaktifanMahasiswa extends Penilaian{
    int nilai_keaktifan;
    public KeaktifanMahasiswa(){
        this.nilai_keaktifan = 0;
    }
    @Override
    public double nilaiKeaktifan(){
        return ((nilai_keaktifan* 0.1) + nilaiAkhir());
    }      
}
