/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3_Inheritance;

/**
 *
 * @author teguh
 */
public class tabung extends lingkaran {
int t;
double volume, luasPermukaan;

public tabung (int r, int t) {
super(r);
this.t = t;
}
void Keterangan (){
Deskripsi();
  System.out.println("mengitung Volume Tabung");
}
double HitvolumeTabung() {
volume = (HitluasLingkaran () * t);
return volume;
}
}
