/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ContohBuffer {
    
        public static void main(String[] args) throws IOException {
           String nama;
           int usia;
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            System.out.print("Masukan Nama :");
            nama  = br.readLine();
            System.out.print("Masukan Usia :");
            usia = Integer.parseInt(br.readLine());
            System.out.println("Nama mu adalah = "+nama);
            System.out.println("Usia mu adalah = "+usia);
            
            
        }
    
}
