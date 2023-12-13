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
public class Main {
public static void main(String[] args) {
lingkaran lkr = new lingkaran (7); // memanggil constructor lkr.Deskripsi();
System.out.println("Hasilnya adalah :" + lkr.HitluasLingkaran());
tabung tbg= new tabung (7, 20);
tbg.Keterangan ();
System.out.println("volumenya adalah :"+tbg.HitvolumeTabung());
}
}