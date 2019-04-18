/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarStatic.data;

/**
 *
 * @author alanupermana
 */
public class user {
    static String nama = "Alanu";
    String nik;
    int umur;
    
    
    public static void tanyaNama(){
        System.out.println("Nama : " + nama);
        
    }
    
    public int umur(){
        return 20;
    }
    
}
