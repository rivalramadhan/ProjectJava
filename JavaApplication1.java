/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("=================");
        System.out.println("Informasi Pribadi      ");
        System.out.println("=================");
        String nama, nik, ttl,status, kel;
        int umur;
        Scanner inputnama = new Scanner (System.in); 
        System.out.print("Inputkan Nama :");
        nama = inputnama.nextLine();
        Scanner inputnik = new Scanner(System.in);
        System.out.print("Inputkan NIK :");
        nik = inputnik.nextLine();
        Scanner inputtl = new Scanner (System.in);
        System.out.print("Inputkan Tempat, Tanggal lahir Anda :");
        ttl = inputtl.nextLine();
        Scanner inputsts = new Scanner(System.in);
        System.out.print("Inputkan Status  anda saat ini :");
        status = inputsts.nextLine();
        Scanner inputumur = new Scanner(System.in);
        System.out.print("Inputkan Umur Anda Saat Ini :");
        umur = inputumur.nextInt();
        Scanner inputkel = new Scanner(System.in);
        System.out.print("Inputkan Jenis Kelamin :");
        kel = inputkel.nextLine();
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println("Nama anda adalah " +nama);
        System.out.println("Nik anda adalah " +nik);
        System.out.println("Tempat, Tanggal lahir anda " +ttl);
        System.out.println("Status anda saat ini adalah " +status);
        System.out.println("Umur anda saat ini adalah " +umur);
        System.out.println("Jenis kelamin anda adalah " +kel);
        
        
                       
//        int usia = 18;
//        String nama = "ripallino";
//        String ttl = "Malang, 02 nov 2004";
//        String nik = "081939626748";
//        String jkel = "L";
//        System.out.println("Halloo");
//        System.out.println("Nama ku Adalah :" + nama);
//        System.out.println("Usia saya Adalah :" + usia);
//        System.out.println("Nik :" + nik);
//        System.out.println("Tempat, Tanggal lahir :" + ttl);
//        System.out.println("Jenis Kelamin :" + jkel);
        
    }
    
}
