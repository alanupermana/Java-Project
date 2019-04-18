
package belajarjavaoop;


public class BelajarJavaOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mobil objMbl = new Mobil();
        System.out.println(objMbl.merk);
        
        objMbl.jalan();
        
        int hasil = objMbl.hitungJarak();
        System.out.println(hasil);
    }
    
}
