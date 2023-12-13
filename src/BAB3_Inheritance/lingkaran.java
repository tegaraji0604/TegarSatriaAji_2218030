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
public class lingkaran {
int r;
double phi, luas;
public lingkaran (int r) {
this.r = r;
phi = 3.14;
}
void Deskripsi(){
System.out.println("Ini adalah hasil menghitung");
}
double HitluasLingkaran () {
luas=(phi*r*r);
return luas;
}
}