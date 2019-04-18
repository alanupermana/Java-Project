/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarConstractor;

/**
 *
 * @author alanupermana
 */
public class Customer {
    
    String nama;
    int umur;
    
    Customer(){
        System.out.println("Cons 1");
        
    }
    
    Customer(String nama){
        this.nama = nama;
        System.out.println("Cons 2 " + "Namanya : " + nama);
        
    }
    
    Customer(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        System.out.println("Cons 3 " + "Namanya ;" + nama + "Umurnya : " + umur);
         
    }
    
}
