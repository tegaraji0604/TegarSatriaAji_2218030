/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme;

/**
 *
 * @author teguh
 */
public class Driveclass {
    public static void main (String []args ){
        Manusia manusia = new Manusia();
        
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        
       manusia.makanBuah(apel);
       manusia.makanBuah(pisang);
    }
}
