/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation.aplikasi;
import Encapsulation.Data.Mahasiswa;
import java.util.Scanner;
/**
 *
 * @author alanupermana
 */
public class MainAplikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();
        
        System.out.print("INPUT NAMA : ");
        String a = input.nextLine();
        m.setNama(a);
        System.out.println(m.getNama());
    }
    
}
