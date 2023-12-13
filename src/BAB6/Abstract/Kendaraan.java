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

  
abstract class Kendaraan {

    String jenis;


    public Kendaraan(String jenis) {
        this.jenis = jenis;
    }
    abstract void start();
    
    abstract void stop();
    void displayInfo() {
        System.out.println("Jenis Kendaraan: " + jenis);
    }
}

class Motor extends Kendaraan {

    public Motor(String jenis) {
        super(jenis);
    }

    @Override
    void start() {
        System.out.println("Menyalakan mesin motor");
    }
    @Override
    void stop() {
        System.out.println("Mematikan mesin motor");
    }
}
class Mobil extends Kendaraan {
    public Mobil(String jenis) {
        super(jenis);
    }
    @Override
    void start() {
        System.out.println("Menyalakan mesin mobil");
    }
    @Override
    void stop() {
        System.out.println("Mematikan mesin mobil");
    }
}





