/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author teguh
 */

public class Main {
    public static void main(String[] args) {
        Kendaraan motor = new Motor("Motor Honda");
        motor.displayInfo();
        motor.start();
        motor.stop();
        System.out.println();

        Kendaraan mobil = new Mobil("Mobil Toyota");
        mobil.displayInfo();
        mobil.start();
        mobil.stop();
    }
}
