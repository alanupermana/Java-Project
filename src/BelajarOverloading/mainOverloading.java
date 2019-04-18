/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarOverloading;

/**
 *
 * @author alanupermana
 */
public class mainOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menghitung objM = new Menghitung();
        
         int a = objM.jumlah(5, 5);
         int b = objM.jumlah(5, 6, 7);
         System.out.println(a);
         System.out.println(b);
    }
    
}
