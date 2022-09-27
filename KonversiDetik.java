/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        int jam,menit,detik, sisa;
        Scanner inputdetik = new Scanner (System.in); 
        System.out.print("Masukkan detik :");
        detik  = inputdetik.nextInt();
        jam = detik / 3600;
        menit = (detik % 3600) / 60;
        sisa = (detik % 3600) - (menit * 60);
        System.out.println(jam + "Jam " + " - " + menit + "menit" + " - " + sisa + "detik");                       
    }
    
}

