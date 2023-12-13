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

public class mainGaji {
    public static void main(String[] args) { 
        pembayaranGaji gaji=new pembayaranGaji(); 
        gaji.setInput( "G123456"); 
        System.out.println("Rekening yang anda masukkan : "+gaji.getInput());
        System.out.println("Jumlah saldo anda: "+gaji.cekSaldo());
}
}
