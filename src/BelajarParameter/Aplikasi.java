/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarParameter;

import java.util.Scanner;

/**
 *
 * @author alanupermana
 */
public class Aplikasi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input A : ");
        float a = input.nextInt();
        
        System.out.print("Input B : ");
        float b = input.nextInt();
        
        User objUs = new User();
        System.out.println(objUs.beratBadan(a, b));
    }
    
}
