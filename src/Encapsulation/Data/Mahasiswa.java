/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation.Data;

/**
 *
 * @author alanupermana
 */
public class Mahasiswa {
    private String nama;
    private int umur;
    
    public String getNama(){
        
        
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
        public int getUmur(){
        return this.umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
}
